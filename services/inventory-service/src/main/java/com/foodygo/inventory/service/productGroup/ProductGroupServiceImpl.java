package com.foodygo.inventory.service.productGroup;

import com.foodygo.inventory.dto.request.product.ProductCreateRequest;
import com.foodygo.inventory.dto.request.productGroup.ProductGroupCreateRequest;
import com.foodygo.inventory.dto.request.productGroup.ProductGroupUpdateRequest;
import com.foodygo.inventory.dto.response.productGroup.ProductGroupCreateResponse;
import com.foodygo.inventory.dto.response.productGroup.ProductGroupResponse;
import com.foodygo.inventory.dto.response.productGroup.ProductGroupUpdateResponse;
import com.foodygo.inventory.entity.Category;
import com.foodygo.inventory.entity.Product;
import com.foodygo.inventory.entity.ProductGroup;
import com.foodygo.inventory.entity.Product_Category;
import com.foodygo.inventory.mapper.ProductGroupMapper;
import com.foodygo.inventory.mapper.ProductMapper;
import com.foodygo.inventory.repository.CategoryRepository;
import com.foodygo.inventory.repository.ProductCategoryRepository;
import com.foodygo.inventory.repository.ProductGroupRepository;
import com.foodygo.inventory.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class ProductGroupServiceImpl implements ProductGroupService {

    private final ProductGroupRepository productGroupRepository;
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final ProductCategoryRepository productCategoryRepository;

    @Override
    @Transactional
    public ProductGroupCreateResponse createProductGroup(ProductGroupCreateRequest request) {

        Set<Category> categories = this.categoryRepository.findByIdIn(request.getCategoryIds());
        if(this.categoryRepository.findByIdIn(request.getCategoryIds()).isEmpty()) {
            throw new RuntimeException("Not found any category");
        }

        Set<Product> productList = new HashSet<>();
        for(ProductCreateRequest productCreateRequest : request.getProductCreateRequests()) {
            Product product = ProductMapper.INSTANCE.toCreateEntity(productCreateRequest);
            productList.add(this.productRepository.save(product));
        }

        ProductGroup productGroup  = ProductGroupMapper.INSTANCE.toCreateEntity(request);

        Set<Product_Category> product_categories = new HashSet<>();
        for(Category category : categories) {
            Product_Category productCategory = new Product_Category();
            productCategory.setCategories(category);
            productCategory.setProductGroups(productGroup);
            product_categories.add(productCategory);
            productCategoryRepository.save(productCategory);
        }

        productGroup.setProducts(productList);
        productGroup.setProduct_categories(product_categories);

        return ProductGroupMapper.INSTANCE.toCreateResponse(this.productGroupRepository.save(productGroup));
    }

    @Override
    public ProductGroupUpdateResponse updateProductGroup(ProductGroupUpdateRequest request) {
        return null;
    }

    @Override
    public ProductGroupResponse findProductGroupById(Integer id) {
        return null;
    }

    @Override
    public List<ProductGroupResponse> findAllProductGroups() {
        return List.of();
    }
}

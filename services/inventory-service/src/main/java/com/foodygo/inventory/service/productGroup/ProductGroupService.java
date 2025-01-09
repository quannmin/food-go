package com.foodygo.inventory.service.productGroup;

import com.foodygo.inventory.dto.request.productGroup.ProductGroupCreateRequest;
import com.foodygo.inventory.dto.request.productGroup.ProductGroupUpdateRequest;
import com.foodygo.inventory.dto.response.productGroup.ProductGroupCreateResponse;
import com.foodygo.inventory.dto.response.productGroup.ProductGroupResponse;
import com.foodygo.inventory.dto.response.productGroup.ProductGroupUpdateResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductGroupService {
    ProductGroupCreateResponse createProductGroup(ProductGroupCreateRequest request);
    ProductGroupUpdateResponse updateProductGroup(ProductGroupUpdateRequest request);
    ProductGroupResponse findProductGroupById(Integer id);
    List<ProductGroupResponse> findAllProductGroups();
}

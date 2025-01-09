package com.foodygo.inventory.service.category;

import com.foodygo.inventory.dto.request.category.CategoryCreateRequest;
import com.foodygo.inventory.dto.request.category.CategoryUpdateRequest;
import com.foodygo.inventory.dto.response.category.CategoryCreateResponse;
import com.foodygo.inventory.dto.response.category.CategoryResponse;
import com.foodygo.inventory.dto.response.category.CategoryUpdateResponse;
import com.foodygo.inventory.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface CategoryService {
    CategoryCreateResponse createCategory(CategoryCreateRequest request);
    CategoryUpdateResponse updateCategory(CategoryUpdateRequest request);
    CategoryResponse findCategoryById(int id);
    List<CategoryResponse> findAllCategories();
    Set<Category> findAllCategoriesById(List<Integer> ids);
}

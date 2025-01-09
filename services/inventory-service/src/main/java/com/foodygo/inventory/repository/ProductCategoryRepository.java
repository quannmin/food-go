package com.foodygo.inventory.repository;

import com.foodygo.inventory.entity.Product_Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoryRepository extends JpaRepository<Product_Category, Integer> {
}

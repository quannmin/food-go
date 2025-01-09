package com.foodygo.inventory.repository;

import com.foodygo.inventory.entity.ProductGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductGroupRepository extends JpaRepository<ProductGroup, Integer> {
}

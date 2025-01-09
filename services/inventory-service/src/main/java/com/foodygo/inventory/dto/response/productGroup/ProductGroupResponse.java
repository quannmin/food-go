package com.foodygo.inventory.dto.response.productGroup;

import com.foodygo.inventory.util.constant.ProductStatus;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.Instant;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductGroupResponse {
    String name;
    double price;
    String description;
    Instant prepareTime;
    ProductStatus productStatus;
    Integer branchId;
    String branchName;
    Integer quantity;
    List<String> urlImages;
    Instant createdAt;
    String createdBy;
    Instant modifiedAt;
    String modifiedBy;
}

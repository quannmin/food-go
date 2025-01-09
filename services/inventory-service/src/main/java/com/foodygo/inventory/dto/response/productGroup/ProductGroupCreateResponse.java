package com.foodygo.inventory.dto.response.productGroup;

import com.foodygo.inventory.dto.request.product.ProductCreateRequest;
import com.foodygo.inventory.util.constant.ProductStatus;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.multipart.MultipartFile;

import java.time.Instant;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductGroupCreateResponse {
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
}

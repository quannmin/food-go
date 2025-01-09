package com.foodygo.inventory.dto.request.product;

import com.foodygo.inventory.util.constant.ProductStatus;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class ProductCreateRequest {
    Integer branchId;
    @Min(value = 1, message = "Quantity must be > 0")
    Integer quantity;
}

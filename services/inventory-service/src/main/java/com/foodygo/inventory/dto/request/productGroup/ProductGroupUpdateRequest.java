package com.foodygo.inventory.dto.request.productGroup;

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

import java.time.Duration;
import java.time.Instant;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductGroupUpdateRequest {
    @NotNull(message = "Name is required!")
    String name;
    @NotNull(message = "Price is required!")
    @Min(value = 0, message = "Price must be > 0")
    double price;
    String description;
    Duration prepareTime;
    ProductStatus productStatus;
    List<Integer> categoryIds;
    List<ProductCreateRequest> productCreateRequests;
    List<ProductAddOnSectionDTO> productAddOnSections;
    List<MultipartFile> images;
}

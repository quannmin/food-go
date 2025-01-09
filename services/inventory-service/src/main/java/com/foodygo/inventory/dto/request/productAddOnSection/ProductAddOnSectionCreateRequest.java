package com.foodygo.inventory.dto.request.productAddOnSection;

import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductAddOnSectionCreateRequest {
    @NotNull(message = "Name id is required!")
    String name;
    boolean isRequired;

    @NotNull(message = "max choice is required!")
    Integer maxChoice;
    Integer productId;
}

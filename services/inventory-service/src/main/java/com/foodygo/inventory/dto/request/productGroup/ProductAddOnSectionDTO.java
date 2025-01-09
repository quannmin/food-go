package com.foodygo.inventory.dto.request.productGroup;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductAddOnSectionDTO {
    Integer id;
    List<Integer> productAddOnItemIds;
}

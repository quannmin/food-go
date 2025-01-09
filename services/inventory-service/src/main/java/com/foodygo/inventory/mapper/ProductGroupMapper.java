package com.foodygo.inventory.mapper;

import com.foodygo.inventory.dto.request.productGroup.ProductGroupCreateRequest;
import com.foodygo.inventory.dto.request.productGroup.ProductGroupUpdateRequest;
import com.foodygo.inventory.dto.response.productGroup.ProductGroupCreateResponse;
import com.foodygo.inventory.dto.response.productGroup.ProductGroupResponse;
import com.foodygo.inventory.dto.response.productGroup.ProductGroupUpdateResponse;
import com.foodygo.inventory.entity.ProductGroup;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductGroupMapper {
    ProductGroupMapper INSTANCE = Mappers.getMapper(ProductGroupMapper.class);
    ProductGroup toCreateEntity(ProductGroupCreateRequest productGroupCreateRequest);
    ProductGroup toUpdateEntity(ProductGroupUpdateRequest productGroupUpdateRequest);
    ProductGroupCreateResponse toCreateResponse(ProductGroup productGroup);
    ProductGroupUpdateResponse toUpdateResponse(ProductGroup productGroup);
    ProductGroupResponse toResponse(ProductGroup productGroup);
}

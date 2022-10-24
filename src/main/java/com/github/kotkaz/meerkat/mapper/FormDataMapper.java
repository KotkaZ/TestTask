package com.github.kotkaz.meerkat.mapper;

import com.github.kotkaz.meerkat.dto.FormData;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")

public interface FormDataMapper {

    @Mapping(target = "name", source = "userName")
    @Mapping(target = "sector", source = "selectedSector.sectorValue")
    @Mapping(target = "agreement", source = "userAgreement")
    FormData entityToDto(com.github.kotkaz.meerkat.model.FormData entity);
}

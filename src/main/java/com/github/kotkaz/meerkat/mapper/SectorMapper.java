package com.github.kotkaz.meerkat.mapper;

import com.github.kotkaz.meerkat.dto.Sector;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SectorMapper {
    @Mapping(target = "value", source = "sectorValue")
    @Mapping(target = "name", source = "textLabel")
    Sector entityToDto(com.github.kotkaz.meerkat.model.Sector entity);

    List<Sector> entitiesToDtoList(List<com.github.kotkaz.meerkat.model.Sector> entity);
}

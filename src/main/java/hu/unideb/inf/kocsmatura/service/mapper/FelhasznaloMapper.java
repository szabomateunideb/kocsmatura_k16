package hu.unideb.inf.kocsmatura.service.mapper;

import hu.unideb.inf.kocsmatura.data.entity.FelhasznaloEntity;
import hu.unideb.inf.kocsmatura.service.dto.RegisztracioDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface FelhasznaloMapper {

    @Mapping(target = "nem", ignore = true)
    @Mapping(target = "jogosultsagok", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "authorities", ignore = true)
    FelhasznaloEntity dtoToEntity(RegisztracioDto dto);

}

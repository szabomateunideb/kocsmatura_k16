package hu.unideb.inf.kocsmatura.service.mapper;

import hu.unideb.inf.kocsmatura.data.entity.FelhasznaloEntity;
import hu.unideb.inf.kocsmatura.service.dto.RegisztracioDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FelhasznaloMapper {

    FelhasznaloEntity dtoToEntity(RegisztracioDto dto);

}

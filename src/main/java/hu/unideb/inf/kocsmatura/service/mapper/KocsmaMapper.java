package hu.unideb.inf.kocsmatura.service.mapper;

import hu.unideb.inf.kocsmatura.data.entity.KocsmaEntity;
import hu.unideb.inf.kocsmatura.service.dto.KocsmaCardDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface KocsmaMapper {

    KocsmaCardDto kocsmaEntityToDto(KocsmaEntity e);
    List<KocsmaCardDto> kocsmaEntitiesToDtos(List<KocsmaEntity> l);

    @Mapping(target = "lon", ignore = true)
    @Mapping(target = "leiras", ignore = true)
    @Mapping(target = "lat", ignore = true)
    KocsmaEntity kocsmaDtoToEntity(KocsmaCardDto k);
    List<KocsmaEntity> kocsmaDtosToEntites(List<KocsmaCardDto> k);
}

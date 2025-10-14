package hu.unideb.inf.kocsmatura.service.mapper;

import hu.unideb.inf.kocsmatura.data.entity.KocsmaEntity;
import hu.unideb.inf.kocsmatura.service.dto.KocsmaCardDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface KocsmaMapper {

    KocsmaCardDto kocsmaEntityToDto(KocsmaEntity e);
    List<KocsmaCardDto> kocsmaEntitiesToDtos(List<KocsmaEntity> l);

    KocsmaEntity kocsmaDtoToEntity(KocsmaCardDto k);
    List<KocsmaEntity> kocsmaDtosToEntites(List<KocsmaCardDto> k);
}

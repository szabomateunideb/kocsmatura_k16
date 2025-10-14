package hu.unideb.inf.kocsmatura.service.impl;

import hu.unideb.inf.kocsmatura.data.entity.KocsmaEntity;
import hu.unideb.inf.kocsmatura.data.repository.KocsmaRepository;
import hu.unideb.inf.kocsmatura.service.KocsmaCardService;
import hu.unideb.inf.kocsmatura.service.dto.KocsmaCardDto;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.List;

@Service
public class KocsmaCardServiceImpl implements KocsmaCardService {

    final KocsmaRepository repo;

    final ModelMapper mapper;

    public KocsmaCardServiceImpl(KocsmaRepository repo, ModelMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    public KocsmaCardDto findById(Long id) {
        /*KocsmaEntity e = repo.getReferenceById(id);
        KocsmaCardDto dto = mapper.map(e, KocsmaCardDto.class);
        return dto;*/
        return mapper.map(repo.getReferenceById(id), KocsmaCardDto.class);
    }

    @Override
    public KocsmaCardDto findByName(String name) {
        return mapper.map(repo.getByNev(name), KocsmaCardDto.class);

        /*KocsmaEntity e = null;
        for(KocsmaEntity entity : repo.findAll()){
            if(entity.getNev().equals(name)){
                e = entity;
            }
        }
        return mapper.map(e, KocsmaCardDto.class);*/
    }

    @Override
    public List<KocsmaCardDto> findAll() {
        List<KocsmaEntity> entities = repo.findAll();
        Type listType = new TypeToken<List<KocsmaCardDto>>(){}.getType();

        return mapper.map(entities, listType);
    }

    @Override
    public void deleteByName(String name) {

    }

    @Override
    public KocsmaCardDto save(KocsmaCardDto kocsmaCardDto) {
        KocsmaEntity entity =  mapper
                .map(kocsmaCardDto, KocsmaEntity.class);
        entity = repo.save(entity);
        kocsmaCardDto = mapper.map(entity, KocsmaCardDto.class);
        return kocsmaCardDto;
    }
}

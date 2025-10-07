package hu.unideb.inf.kocsmatura.service.impl;

import hu.unideb.inf.kocsmatura.data.entity.KocsmaEntity;
import hu.unideb.inf.kocsmatura.data.repository.KocsmaRepository;
import hu.unideb.inf.kocsmatura.service.KocsmaCardService;
import hu.unideb.inf.kocsmatura.service.dto.KocsmaCardDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return null;
    }

    @Override
    public KocsmaCardDto findByName(String name) {
        return null;
    }

    @Override
    public List<KocsmaCardDto> findAll() {
        return List.of();
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

package hu.unideb.inf.kocsmatura.service;

import hu.unideb.inf.kocsmatura.service.dto.KocsmaCardDto;

import java.util.List;

public interface KocsmaCardService {

    KocsmaCardDto findById(Long id);
    KocsmaCardDto findByName(String name);
    List<KocsmaCardDto> findAll();
    void deleteByName(String name);
    KocsmaCardDto save(KocsmaCardDto kocsmaCardDto);

}

package hu.unideb.inf.kocsmatura.data.repository;

import hu.unideb.inf.kocsmatura.data.entity.JogosultsagEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogosultsagRepository 
        extends JpaRepository<JogosultsagEntity, Long> {

    JogosultsagEntity findByNev(String nev);
}

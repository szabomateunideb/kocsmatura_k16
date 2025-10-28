package hu.unideb.inf.kocsmatura.data.repository;

import hu.unideb.inf.kocsmatura.data.entity.FelhasznaloEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FelhasznaloRepository
        extends JpaRepository<FelhasznaloEntity, Long> {

    FelhasznaloEntity findByFelhasznalonev(String felhasznalonev);
}

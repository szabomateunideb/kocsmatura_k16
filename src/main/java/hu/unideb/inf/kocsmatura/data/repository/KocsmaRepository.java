package hu.unideb.inf.kocsmatura.data.repository;

import hu.unideb.inf.kocsmatura.data.entity.KocsmaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KocsmaRepository
        extends JpaRepository<KocsmaEntity, Long> {

    KocsmaEntity getByNev(String nev);

    Object nev(String nev);
}

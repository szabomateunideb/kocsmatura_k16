package hu.unideb.inf.kocsmatura.data.repository;

import hu.unideb.inf.kocsmatura.data.entity.JelenletEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JelenletRepository
        extends JpaRepository<JelenletEntity, Long> {
}

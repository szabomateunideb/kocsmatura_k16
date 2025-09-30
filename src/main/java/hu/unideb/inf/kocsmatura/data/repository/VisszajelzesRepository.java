package hu.unideb.inf.kocsmatura.data.repository;

import hu.unideb.inf.kocsmatura.data.entity.VisszajelzesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisszajelzesRepository
        extends JpaRepository<VisszajelzesEntity, Long> {
}

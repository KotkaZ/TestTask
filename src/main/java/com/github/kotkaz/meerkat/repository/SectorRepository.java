package com.github.kotkaz.meerkat.repository;

import com.github.kotkaz.meerkat.model.Sector;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectorRepository extends JpaRepository<Sector, Integer> {

    Optional<Sector> findBySectorValue(Integer integer);
}

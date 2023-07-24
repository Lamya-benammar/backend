package com.stage.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stage.backend.entity.Ordonnances;

@Repository
public interface OrdonnancesRepository extends JpaRepository<Ordonnances, Long> {
	Optional<Ordonnances> findById(Long aLong);
}

package com.stage.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stage.backend.entity.Historique;


@Repository
public interface HistoriqueRepository extends JpaRepository<Historique, Long> {
	Optional<Historique> findById(Long aLong);
}

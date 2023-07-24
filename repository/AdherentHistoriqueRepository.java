package com.stage.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stage.backend.entity.AdherentHistorique;

@Repository
public interface AdherentHistoriqueRepository extends JpaRepository<AdherentHistorique, Long>{
	Optional<AdherentHistorique> findById(Long aLong);
}

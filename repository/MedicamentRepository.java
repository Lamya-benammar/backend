package com.stage.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stage.backend.entity.Medicament;

@Repository
public interface MedicamentRepository extends JpaRepository<Medicament, Long> {

	Optional<Medicament> findById(Long aLong);
}

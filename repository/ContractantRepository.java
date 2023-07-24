package com.stage.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stage.backend.entity.Contractant;

@Repository
public interface ContractantRepository extends JpaRepository<Contractant,Long> {
	
	Optional<Contractant> findById(Long aLong);
	
	
}

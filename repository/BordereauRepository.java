package com.stage.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stage.backend.entity.Bordereau;

@Repository
public interface BordereauRepository extends JpaRepository<Bordereau, Long> {
	Optional<Bordereau> findById(Long aLong);
}
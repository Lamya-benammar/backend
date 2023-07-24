package com.stage.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stage.backend.entity.Adherentt;

@Repository
public interface AdherenttRepository extends JpaRepository<Adherentt, Long>{
	Optional<Adherentt> findById(Long aLong);
}

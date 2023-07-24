package com.stage.backend.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stage.backend.entity.SugRec;

@Repository
public interface SugRecRepository extends JpaRepository<SugRec,Long>{
	Optional<SugRec> findById(Long aLong);

//	List<SugRec> searchQueryData(Long numReclamation, String nature, String status);
	
}

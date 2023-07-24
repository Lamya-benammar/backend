package com.stage.backend.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stage.backend.entity.Adherent;

@Repository
public interface AdherentRepository extends JpaRepository<Adherent, Long> {
	Optional<Adherent> findById(Long aLong);
	
//	@Query("select a from adherent a where a.contractant.police=:contractant") 
//    Optional<Adherent> findBycontractant(@Param("contractant") Contractant contractant);
//	
//	 @Query("SELECT a FROM Adherent a WHERE a.contractant.nom = :contractantNom")
//	   List<Adherent> findByContractantNom(@Param("contractantNom") String contractantNom);
}


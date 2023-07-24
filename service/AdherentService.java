package com.stage.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stage.backend.entity.Adherent;
import com.stage.backend.entity.AdherentHistorique;
import com.stage.backend.entity.Contractant;
import com.stage.backend.entity.SugRec;
import com.stage.backend.repository.AdherentHistoriqueRepository;
import com.stage.backend.repository.AdherentRepository;


@Service
public class AdherentService implements IAdherent {
    @Autowired
    private AdherentRepository adherentRepository;
    
    @Autowired
    private AdherentHistoriqueRepository adherentHistoriqueRepository;

    @Override
    public List<Adherent> getAllAdherents() {
        return adherentRepository.findAll();
    }
    @Override
    public String Liste(AdherentRepository adherentRepository) {
		return adherentRepository.toString();
	}
    
    @Override
    public Optional<Adherent> getAdherent(long id) {
    	return adherentRepository.findById(id);
    	
    }
    
    @Override
    public List<AdherentHistorique> getAdherentHistory() {
        return adherentHistoriqueRepository.findAll();
    }
    
    
//    @Override
//    public List<Adherent> getAdherentsByContractantName(String contractantName) {
//        return adherentRepository.findByContractantNom(contractantName);
//    }
    
//	@Override
//	public Optional<Adherent> getAdherentByContractant(Contractant contractant) {
//		 return adherentRepository.findBycontractant(contractant);
//	}

}



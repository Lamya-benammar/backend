package com.stage.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stage.backend.entity.Adherentt;
import com.stage.backend.entity.AdherentHistorique;
import com.stage.backend.repository.AdherentHistoriqueRepository;
import com.stage.backend.repository.AdherenttRepository;

@Service
public class AdherenttService implements IAdherentt {
    @Autowired
    private AdherenttRepository adherentRepository;
    
    @Autowired
    private AdherentHistoriqueRepository adherentHistoriqueRepository;

    @Override
    public List<Adherentt> getAllAdherents() {
        return adherentRepository.findAll();
    }
    @Override
    public String Liste(AdherenttRepository adherentRepository) {
		return adherentRepository.toString();
	}
    
    @Override
    public Optional<Adherentt> getAdherent(long id) {
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

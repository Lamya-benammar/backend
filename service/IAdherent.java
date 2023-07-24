package com.stage.backend.service;

import java.util.List;
import java.util.Optional;

import com.stage.backend.entity.Adherent;
import com.stage.backend.entity.AdherentHistorique;
import com.stage.backend.entity.Contractant;
import com.stage.backend.repository.AdherentRepository;

public interface IAdherent {
	public List<Adherent> getAllAdherents();
	public String Liste(AdherentRepository adherentRepository);
	public Optional<Adherent> getAdherent(long id);
//	public Optional<Adherent> getAdherentByContractant(Contractant contractant);
//	public List<Adherent> getAdherentsByContractantName(String contractantName);
	public List<AdherentHistorique> getAdherentHistory();
	
}
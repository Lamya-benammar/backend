package com.stage.backend.service;

import java.util.List;
import java.util.Optional;

import com.stage.backend.entity.Adherentt;
import com.stage.backend.entity.AdherentHistorique;
import com.stage.backend.repository.AdherenttRepository;

public interface IAdherentt {
	public List<Adherentt> getAllAdherents();
	public String Liste(AdherenttRepository adherentRepository);
	public Optional<Adherentt> getAdherent(long id);
//	public Optional<Adherent> getAdherentByContractant(Contractant contractant);
//	public List<Adherent> getAdherentsByContractantName(String contractantName);
	public List<AdherentHistorique> getAdherentHistory();
	
}

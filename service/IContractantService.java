package com.stage.backend.service;

import java.util.List;

import com.stage.backend.entity.Contractant;
import com.stage.backend.repository.ContractantRepository;

public interface IContractantService  {
	public String Liste(ContractantRepository contractantRepository);
	public Contractant addContractant(Contractant contractant);
	public List<Contractant> getAllContractants();
}
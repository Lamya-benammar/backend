package com.stage.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stage.backend.entity.Contractant;
import com.stage.backend.repository.ContractantRepository;

@Service
public class ContractantService implements IContractantService {
	@Autowired
	public ContractantRepository contractantRepository;
	
	public String Liste(ContractantRepository contractantRepository) {
		return contractantRepository.toString();
	}
	
	public Contractant addContractant(Contractant contractant) {
        return contractantRepository.save(contractant);
    }
	
	public List<Contractant> getAllContractants() {
        return contractantRepository.findAll();
    }

	
	
	
}

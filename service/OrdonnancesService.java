package com.stage.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stage.backend.entity.Ordonnances;
import com.stage.backend.repository.OrdonnancesRepository;

@Service
public class OrdonnancesService implements IOrdonnances{
	@Autowired
	private OrdonnancesRepository ordonnancesRepository;
    private List<Ordonnances> ordonnancesList;

    public OrdonnancesService() {
        this.ordonnancesList = new ArrayList<>();
    }

	@Override
	public Ordonnances addOrdonnances(Ordonnances ordonnances) {
		return ordonnancesRepository.save(ordonnances);
	}

	@Override
	public List<Ordonnances> getAllOrdonnances() {
		return ordonnancesRepository.findAll();
	}

	@Override
	public void deleteOrdonnances(int OrdonnancesId) {
		for (Ordonnances ordonnances : ordonnancesList) {
            if (ordonnances.getnTransaction() == OrdonnancesId) {
            	ordonnancesList.remove(ordonnances);
                break;
            }
        }
		
	}
}

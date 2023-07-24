package com.stage.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stage.backend.entity.Historique;
import com.stage.backend.repository.HistoriqueRepository;

@Service
public class HistoriqueService implements IHistorique{
	
	@Autowired
	private HistoriqueRepository historiqueRepository;
    private List<Historique> historiqueList;

    public HistoriqueService() {
        this.historiqueList = new ArrayList<>();
    }

	@Override
	public Historique addHistorique(Historique historique) {
		return historiqueRepository.save(historique);
	}

	@Override
	public List<Historique> getAllHistorique() {
		return historiqueRepository.findAll();
	}

	@Override
	public void deleteHistorique(int HistoriqueId) {
		for (Historique historique : historiqueList) {
            if (historique.getnTransaction() == HistoriqueId) {
            	historiqueList.remove(historique);
                break;
            }
        }
		
	}

	
}

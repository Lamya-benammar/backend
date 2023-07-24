package com.stage.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stage.backend.entity.Medicament;
import com.stage.backend.repository.MedicamentRepository;

@Service
public class MedicamentService implements IMedicament{
	@Autowired
	private MedicamentRepository medicamentRepository;
    private List<Medicament> bordereauList;

    public MedicamentService() {
        this.bordereauList = new ArrayList<>();
    }

	@Override
	public Medicament addMedicament(Medicament bordereau) {
		return medicamentRepository.save(bordereau);
	}

	@Override
	public List<Medicament> getAllMedicament() {
		return medicamentRepository.findAll();
	}

	@Override
	public void deleteMedicament(int BordereauId) {
		for (Medicament bordereau : bordereauList) {
            if (bordereau.getRef() == BordereauId) {
            	bordereauList.remove(bordereau);
                break;
            }
        }
		
	}
}

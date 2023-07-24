package com.stage.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stage.backend.entity.Bordereau;
import com.stage.backend.repository.BordereauRepository;

@Service
public class BordereauService implements IBordereau{
	@Autowired
	private BordereauRepository bordereauRepository;
    private List<Bordereau> bordereauList;

    public BordereauService() {
        this.bordereauList = new ArrayList<>();
    }

	@Override
	public Bordereau addBordereau(Bordereau bordereau) {
		return bordereauRepository.save(bordereau);
	}

	@Override
	public List<Bordereau> getAllBordereau() {
		return bordereauRepository.findAll();
	}

	@Override
	public void deleteBordereau(int BordereauId) {
		for (Bordereau bordereau : bordereauList) {
            if (bordereau.getNumFacture() == BordereauId) {
            	bordereauList.remove(bordereau);
                break;
            }
        }
		
	}
}

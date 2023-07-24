package com.stage.backend.service;

import java.util.List;

import com.stage.backend.entity.Medicament;

public interface IMedicament {
	Medicament addMedicament(Medicament edicament);
    List<Medicament> getAllMedicament();
    void deleteMedicament(int medicamentRef);
}

package com.stage.backend.service;

import java.util.List;

import com.stage.backend.entity.Ordonnances;

public interface IOrdonnances {
	Ordonnances addOrdonnances(Ordonnances ordonnances);
    List<Ordonnances> getAllOrdonnances();
    void deleteOrdonnances(int OrdonnancesId);
}

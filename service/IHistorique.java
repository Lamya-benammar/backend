package com.stage.backend.service;

import java.util.List;

import com.stage.backend.entity.Historique;

public interface IHistorique {

	Historique addHistorique(Historique historique);
    List<Historique> getAllHistorique();
    void deleteHistorique(int HistoriqueId);
}

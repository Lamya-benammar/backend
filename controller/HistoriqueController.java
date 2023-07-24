package com.stage.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.stage.backend.entity.Historique;
import com.stage.backend.service.IHistorique;

@RestController
@RequestMapping("/historique")
@CrossOrigin(origins = "http://localhost:4200")
public class HistoriqueController {
	private List<Historique> historiqueList = new ArrayList<>();
	
	@Autowired
	private IHistorique iHistorique;

	public void HistoriqueService() {
        this.historiqueList = new ArrayList<>();
    }
	
	@GetMapping("/liste")
    public List<Historique> getAllHistorique() {
        return iHistorique.getAllHistorique();
    }
    
	@PostMapping(value = "/add",consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void addHistorique(@RequestBody Historique historique) {
		iHistorique.addHistorique(historique);
    }

    @DeleteMapping(value = "/delete")
    public void deleteHistorique(int nTransaction) {
        for (Historique historique : historiqueList) {
            if (historique.getnTransaction() == nTransaction) {
            	historiqueList.remove(historique);
                break;
            }
        }
    }
}

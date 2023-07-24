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

import com.stage.backend.entity.Ordonnances;
import com.stage.backend.service.IOrdonnances;

@RestController
@RequestMapping("/ordonnances")
@CrossOrigin(origins = "http://localhost:4200")
public class OrdonnancesController {
	
private List<Ordonnances> ordonnancesList = new ArrayList<>();
	
	@Autowired
	private IOrdonnances iOrdonnances;

	public void OrdonnancesService() {
        this.ordonnancesList = new ArrayList<>();
    }
	
	@GetMapping("/liste")
    public List<Ordonnances> getAllOrdonnances() {
        return iOrdonnances.getAllOrdonnances();
    }
    
	@PostMapping(value = "/add",consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void addOrdonnances(@RequestBody Ordonnances ordonnances) {
		iOrdonnances.addOrdonnances(ordonnances);
    }

    @DeleteMapping(value = "/delete")
    public void deleteOrdonnances(int nTransaction) {
        for (Ordonnances ordonnances : ordonnancesList) {
            if (ordonnances.getnTransaction() == nTransaction) {
            	ordonnancesList.remove(ordonnances);
                break;
            }
        }
    }
}

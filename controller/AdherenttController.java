package com.stage.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stage.backend.MyData;
import com.stage.backend.entity.Adherent;
import com.stage.backend.entity.AdherentHistorique;
import com.stage.backend.service.IAdherent;

@RestController
@RequestMapping("/adherentt")
@CrossOrigin(origins = "http://localhost:4200")
public class AdherenttController {

	@GetMapping("/data")
	public MyData getData() {
		
		MyData data = new MyData();
	    data.setName("jphbbbn");
	    data.setAge(2);
	    return data;
	}
	
    @Autowired
    private IAdherent iAdherent;
    

    @GetMapping("/liste")
    public List<Adherent> getAllAdherents() {
        return iAdherent.getAllAdherents();
    }
    
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome pharcamcien";
    }

    @GetMapping("/welcomeADMIN")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String welcomeAdmin() {
        return "Welcome ADMIN";
    }
    
    @GetMapping("/adherents/{id}")
    public ResponseEntity<Adherent> getAdherent(@PathVariable long id) {
        Optional<Adherent> adherentOptional = iAdherent.getAdherent(id);
        
        if (adherentOptional.isPresent()) {
            Adherent adherent = adherentOptional.get();
            return new ResponseEntity<>(adherent, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    
    @GetMapping("/historique")
    public List<AdherentHistorique> getAdherentHistory() {
        return iAdherent.getAdherentHistory();
    }
}

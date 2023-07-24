package com.stage.backend.controller;


import com.stage.backend.MyData;
import com.stage.backend.entity.Adherent;
import com.stage.backend.entity.AdherentHistorique;
import com.stage.backend.service.IAdherent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

//import java.util.Objects;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/adherent")
@CrossOrigin(origins = "http://localhost:4200")
public class AdherentController  {
	

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
    
    
//    @GetMapping("/adherents/{contractant.police}")
//    public ResponseEntity<Adherent> findIdBycontractant(@PathVariable long id) {
//        Optional<Adherent> adherentOptional = iAdherent.getAdherent(id);
//        
//        if (adherentOptional.isPresent()) {
//            Adherent adherent = adherentOptional.get();
//            return new ResponseEntity<>(adherent, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
    
//    @GetMapping("/adherents")
//    public ResponseEntity<List<Adherent>> getAdherentsByContractant(@RequestParam String contractantName) {
//        List<Adherent> adherents = iAdherent.getAdherentsByContractantName(contractantName);
//        
//        if (!adherents.isEmpty()) {
//            return new ResponseEntity<>(adherents, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
}
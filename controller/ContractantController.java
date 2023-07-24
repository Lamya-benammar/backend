package com.stage.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stage.backend.MyData;
import com.stage.backend.entity.Contractant;
import com.stage.backend.repository.ContractantRepository;
import com.stage.backend.service.ContractantService;
import com.stage.backend.service.IContractantService;

@RestController
@RequestMapping("/contractants")
@CrossOrigin(origins = "http://localhost:4200")
public class ContractantController {

	@GetMapping("/data")
	public MyData getData() {
		
		MyData data = new MyData();
	    data.setName("jphn");
	    data.setAge(2);
	    return data;
	}
	
	@Autowired
	private ContractantService contractantService;
	
	@Autowired
	private IContractantService iContractantService;
	
	/*@GetMapping("/liste")
    public String ContractantsListe() {
        return iContractantService.Liste(contractantRepository);
	}*/
    
	@GetMapping("/listes")
	public Contractant Listes() {
		Contractant ct = new Contractant();
		ct.setNom("x");
		ct.setPolice(0);
		return ct;
		
	}
	@GetMapping("/liste")
    public List<Contractant> getAllContractants() {
        return iContractantService.getAllContractants();
    }
	
	@PostMapping(value="/add",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Contractant> addContractant(@RequestBody Contractant contractant) {
        Contractant newContractant = contractantService.addContractant(contractant);
        return ResponseEntity.ok(newContractant);
    }
}

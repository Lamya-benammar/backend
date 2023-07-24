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

import com.stage.backend.entity.Medicament;
import com.stage.backend.service.IMedicament;

@RestController
@RequestMapping("/medicament")
@CrossOrigin(origins = "http://localhost:4200")
public class MedicamentController {
	
private List<Medicament> bordereauList = new ArrayList<>();
	
	@Autowired
	private IMedicament iBordereau;

	public void MedicamentService() {
        this.bordereauList = new ArrayList<>();
    }
	
	@GetMapping("/liste")
    public List<Medicament> getAllMedicament() {
        return iBordereau.getAllMedicament();
    }
    
	@PostMapping(value = "/add",consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void addMedicament(@RequestBody Medicament bordereau) {
		iBordereau.addMedicament(bordereau);
    }

    @DeleteMapping(value = "/delete")
    public void deleteBordereau(int nTransaction) {
        for (Medicament bordereau : bordereauList) {
            if (bordereau.getRef() == nTransaction) {
            	bordereauList.remove(bordereau);
                break;
            }
        }
    }

}

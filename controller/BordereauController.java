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

import com.stage.backend.entity.Bordereau;
import com.stage.backend.service.IBordereau;

@RestController
@RequestMapping("/bordereau")
@CrossOrigin(origins = "http://localhost:4200")
public class BordereauController {
	private List<Bordereau> bordereauList = new ArrayList<>();
	
	@Autowired
	private IBordereau iBordereau;

	public void BordereauService() {
        this.bordereauList = new ArrayList<>();
    }
	
	@GetMapping("/liste")
    public List<Bordereau> getAllBordereau() {
        return iBordereau.getAllBordereau();
    }
    
	@PostMapping(value = "/add",consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void addBordereau(@RequestBody Bordereau bordereau) {
		iBordereau.addBordereau(bordereau);
    }

    @DeleteMapping(value = "/delete")
    public void deleteBordereau(int nTransaction) {
        for (Bordereau bordereau : bordereauList) {
            if (bordereau.getNumFacture() == nTransaction) {
            	bordereauList.remove(bordereau);
                break;
            }
        }
    }
}

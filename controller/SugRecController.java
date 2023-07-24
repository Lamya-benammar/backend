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

import com.stage.backend.MyData;
import com.stage.backend.entity.SugRec;
import com.stage.backend.service.ISugRecService;

@RestController
@RequestMapping("/SugRec")
@CrossOrigin(origins = "http://localhost:4200")
public class SugRecController {
	@GetMapping("/data")
	public MyData getData() {
		
		MyData data = new MyData();
	    data.setName("jphn");
	    data.setAge(2);
	    return data;
	}
	private List<SugRec> sugRecList = new ArrayList<>();
	
	@Autowired
	private ISugRecService iSugRecService;

	public void SugRecService() {
        this.sugRecList = new ArrayList<>();
    }
	
	@GetMapping("/liste")
    public List<SugRec> getAllSugRec() {
        return iSugRecService.getAllSugRec();
    }
    
	@PostMapping(value = "/add",consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void addSugRec(@RequestBody SugRec sugRec) {
    	iSugRecService.addSugRec(sugRec);
    }

    @DeleteMapping(value = "/delete")
    public void deleteSugRec(int sugRecnRec) {
        for (SugRec sugRec : sugRecList) {
            if (sugRec.getnRec() == sugRecnRec) {
                sugRecList.remove(sugRec);
                break;
            }
        }
    }
}

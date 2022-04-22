//Pratyush P Menon 901337
package com.cts.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.model.Vaccine;
import com.cts.project.service.VaccineService;



@RestController
@CrossOrigin(origins="http://localhost:3000")
public class VaccineController {


	    @Autowired(required=true)
	    VaccineService vaccineService;

	    @GetMapping("/vaccine")
	    public List<Vaccine> getVaccineDetails(){
	        return vaccineService.getAllVaccineDetails();
	    }

	    @GetMapping("/vaccine/{id}")
	    public Vaccine getVaccineDetails(@PathVariable long id){
	        return vaccineService.getVaccineDetails(id);
	    }

	    @PostMapping("/vaccine")
	    public void addVaccineDetails(@RequestBody Vaccine vaccine){
	    	vaccineService.addVaccineDetails(vaccine);
	    }

	    @DeleteMapping("/vaccine/{id}")
	    public void deleteVaccineDetails(@PathVariable int id){
	    	vaccineService.deleteVaccineDetails(id);
	    }

	    @PutMapping("/vaccine/{id}")
	    public void updateTestingDetails(@RequestBody Vaccine vaccine, @PathVariable int id){
	    	vaccineService.updateVaccineDetails(id, vaccine);
	    }
	
}
// Manikandan M 901363
package com.cts.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.model.Vaccine;
import com.cts.project.service.VaccineService;

@RestController
@RequestMapping("/record")
@CrossOrigin(origins = "http://localhost:3000")
public class SearchRecord {
	
	
	@Autowired
	VaccineService vaccineService;
	
	@GetMapping("/{adhaarNumber}")
	@ResponseBody
	public Vaccine getVaccinedetails(@PathVariable long adhaarNumber)
	{
		return vaccineService.getVaccinedetails(adhaarNumber);
	}
}
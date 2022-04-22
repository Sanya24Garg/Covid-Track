  //Ramyashri Ravindran 901488
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

import com.cts.project.model.Testing;
import com.cts.project.service.TestingService;


@RestController
@CrossOrigin(origins="http://localhost:3000")
public class TestingController {


	    @Autowired(required=true)
	    TestingService testingService;

	    @GetMapping("/testing")
	    public List<Testing> getTestingDetails(){
	        return testingService.getAllTestingDetails();
	    }

	    @GetMapping("/testing/{id}")
	    public Testing getTestingDetails(@PathVariable int id){
	        return testingService.getTestingDetails(id);
	    }

	    @PostMapping("/testing")
	    public void addTestingDetails(@RequestBody Testing testing){
	    	testingService.addTestingDetails(testing);
	    }

	    @DeleteMapping("/testing/{id}")
	    public void deleteTestingDetails(@PathVariable int id){
	    	testingService.deleteTestingDetails(id);
	    }

	    @PutMapping("/testing/{id}")
	    public void updateTestingDetails(@RequestBody Testing testing, @PathVariable int id){
	    	testingService.updateTestingDetails(id, testing);
	    }
	
}
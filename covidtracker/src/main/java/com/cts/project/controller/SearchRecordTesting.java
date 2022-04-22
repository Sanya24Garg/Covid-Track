//Sathish Kumar K 901036
package com.cts.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.model.Testing;
import com.cts.project.service.TestingService;


@RestController
@RequestMapping("/testingrecord")
@CrossOrigin(origins = "http://localhost:3000")
public class SearchRecordTesting {
	@Autowired
	TestingService testingService;
	
	@GetMapping("/{adhaarNumber}")
	@ResponseBody
	public Testing getTestingdetails(@PathVariable long adhaarNumber)
	{
		return testingService.getTestingdetails(adhaarNumber);
	}
}

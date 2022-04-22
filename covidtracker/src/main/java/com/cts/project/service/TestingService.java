  //Ramyashri Ravindran 901488
package com.cts.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.project.model.Testing;
import com.cts.project.repo.TestingRepo;



@Service
public class TestingService {

	@Autowired
	TestingRepo testingRepo;
	
	public List<Testing> getAllTestingDetails(){
        List<Testing> testingList = new ArrayList<>();
        testingRepo.findAll().forEach(testingList::add);
        return testingList;
    }

    public Testing getTestingDetails(int id){
        return testingRepo.findById(id).orElse(null);
    }

    public void addTestingDetails(Testing testing){
        testingRepo.save(testing);
    }

    public void deleteTestingDetails(int id){
        testingRepo.deleteById(id);
    }

    public void updateTestingDetails(int id, Testing testing){
        testing.setTestingId(id);
        testingRepo.save(testing);
    }

	public Testing getTestingdetails(long adhaarNumber) {
		
    	return testingRepo.getTestingdetails(adhaarNumber);
	}
}
//Pratyush P Menon 901337
package com.cts.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.project.model.Vaccine;
import com.cts.project.repo.VaccineRepo;

@Service
public class VaccineService {

	@Autowired
	VaccineRepo vaccineRepo;
	
	public List<Vaccine> getAllVaccineDetails(){
        List<Vaccine> vaccineList = new ArrayList<>();
        vaccineRepo.findAll().forEach(vaccineList::add);
        return vaccineList;
    }

    public Vaccine getVaccineDetails(long id){
        return vaccineRepo.findById(id).orElse(null);
    }

    public void addVaccineDetails(Vaccine vaccine){
        vaccineRepo.save(vaccine);
    }

    public void deleteVaccineDetails(long id){
        vaccineRepo.deleteById(id);
    }

    public void updateVaccineDetails(int id, Vaccine vaccine){
        vaccine.setVaccineId(id);
        vaccineRepo.save(vaccine);
    }
    public Vaccine getVaccinedetails(long adhaarNumber)
    {
    	return vaccineRepo.getVaccinedetails(adhaarNumber);
    }
}
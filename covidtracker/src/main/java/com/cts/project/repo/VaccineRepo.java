//Pratyush P Menon 901337
package com.cts.project.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.project.model.Vaccine;



@Repository
public interface VaccineRepo extends JpaRepository<Vaccine,Long>{

	@Query(value = "SELECT * FROM vaccine where adhaar_number=?", nativeQuery = true)
	Vaccine getVaccinedetails(long adhaarNumber);

}

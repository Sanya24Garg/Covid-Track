  //Ramyashri Ravindran 901488
package com.cts.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.project.model.Testing;
import com.cts.project.model.Vaccine;


@Repository
public interface TestingRepo extends JpaRepository<Testing,Integer>{

	@Query(value = "SELECT * FROM testing where adhaar_number=?", nativeQuery = true)
	Testing getTestingdetails(long adhaarNumber);

}

 // Manikandan M 901363
package com.cts.project.repo;

import java.io.Serializable;



//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.project.model.AdminDetails;



@Repository
public interface AdminRepo extends JpaRepository<AdminDetails, Serializable> {

	// List<User> findAll();
	@Query(value ="select * from admin where email=?", nativeQuery = true)
	AdminDetails find(String email);
	

}

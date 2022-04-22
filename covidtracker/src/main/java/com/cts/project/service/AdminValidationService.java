 // Manikandan M 901363
package com.cts.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.project.model.AdminDetails;
import com.cts.project.repo.AdminRepo;



@Service
public class AdminValidationService implements AdminLoginService {

	@Autowired
	private AdminRepo adminDao;

	public boolean validateLogin(String email, String password) {
		AdminDetails existingAdmin = adminDao.find(email);
		System.out.println(existingAdmin);
		if (existingAdmin != null) {
			if (existingAdmin.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	
	
}

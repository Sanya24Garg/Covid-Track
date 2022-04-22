// Manikandan M 901363
package com.cts.project.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.model.AdminLogin;
import com.cts.project.service.AdminLoginService;



@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AdminController {
	
	@Autowired
	private AdminLoginService adminService;
	


	@PostMapping("/login")
	@ResponseStatus(HttpStatus.OK)
	public boolean validate(@RequestBody AdminLogin login) {
		System.out.println(login);
		boolean status = adminService.validateLogin(login.getEmail(), login.getPassword());
		if (status)
			return status;
		else
			return (Boolean) null;
	}
	

	@GetMapping("/logout")
	public boolean logout(HttpSession session) {
		session.invalidate();

		return false;
	}

	
	
	

	
}

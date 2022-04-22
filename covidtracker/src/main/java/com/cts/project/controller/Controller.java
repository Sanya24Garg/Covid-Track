package com.cts.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cts.project.model.User;
import com.cts.project.service.UserService;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class Controller {

    @Autowired
    UserService userService;
 // Manikandan M 901363
    @GetMapping("/persons")
    public List<User> getAllPersons(){
        return userService.getAllPersons();
    }

    @GetMapping("/persons/{id}")
    public User getPerson(@PathVariable int id){
        return userService.getPerson(id);
    }
    //Sathish Kumar 901036
    @PostMapping("/person")
    public void addPerson(@RequestBody User user){
        userService.addPerson(user);
    }
  //Ramyashri Ravindran 901488
    @DeleteMapping("/persons/{id}")
    public void deletePerson(@PathVariable int id){
        userService.deletePerson(id);
    }
  //Sathish Kumar 901036
    @PutMapping("/persons/{id}")
    public void updateStudent(@RequestBody User user, @PathVariable int id){
        userService.updatePerson(id,user);
    }
}

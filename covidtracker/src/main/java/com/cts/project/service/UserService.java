package com.cts.project.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.project.model.User;
import com.cts.project.repo.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepo;
    // Manikandan M 901363
    public List<User> getAllPersons(){
        List<User> userList = new ArrayList<>();
        userRepo.findAll().forEach(userList::add);
        return userList;
    }

    public User getPerson(int id){
        return userRepo.findById(id).orElse(null);
    }
  //Sathish Kumar 901036
    public void addPerson(User user){
        userRepo.save(user);
    }
    //Ramyashri Ravindran 901488
    public void deletePerson(int id){
        userRepo.deleteById(id);
    }
  //Sathish Kumar 901036
    public void updatePerson(int id, User user){
        user.setId(id);
        userRepo.save(user);
    }
}

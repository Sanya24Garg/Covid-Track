//Sathish Kumar 901036
package com.cts.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.project.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}

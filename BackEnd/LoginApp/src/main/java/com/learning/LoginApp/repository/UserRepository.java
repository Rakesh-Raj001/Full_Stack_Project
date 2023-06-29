package com.learning.LoginApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.LoginApp.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
  User findByEmail(String email);
}

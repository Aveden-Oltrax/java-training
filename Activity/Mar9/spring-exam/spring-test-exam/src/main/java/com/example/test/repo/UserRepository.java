package com.example.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, String> {

}

package com.example.demo.repository;

import com.example.demo.mysql.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public class UserRepository extends CrudRepository<User, Integer> {
    List<User> findByMobile(String mobile);
}

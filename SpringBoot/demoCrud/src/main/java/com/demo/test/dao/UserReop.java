package com.demo.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.demo.test.entities.User;

public interface UserReop extends CrudRepository<User, Integer>{

}

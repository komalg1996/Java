package com.study.dao;

import org.springframework.data.repository.CrudRepository;

import com.study.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
}

package com.bernardosantos.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bernardosantos.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String>{
	
	
	
}

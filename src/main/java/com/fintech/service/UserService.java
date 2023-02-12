package com.fintech.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fintech.dto.User;
import com.fintech.repository.OpenApiSpecificationRepo;

@Service
public class UserService {

	@Autowired
	private OpenApiSpecificationRepo apiSpecificationRepo;

	@Autowired
	public UserService(OpenApiSpecificationRepo apiSpecificationRepo) {
		this.apiSpecificationRepo = apiSpecificationRepo;
	}

	public User addUser(User user) {
		apiSpecificationRepo.save(user);
		return user;
	}

	public User findUserbyId(int id) {
		return apiSpecificationRepo.findById(id).orElse(null);
	}

	public void deleteById(int id) {
		apiSpecificationRepo.deleteById(id);
	}

	public List<User> findAllUsers() {
		return apiSpecificationRepo.findAll();
	}

}

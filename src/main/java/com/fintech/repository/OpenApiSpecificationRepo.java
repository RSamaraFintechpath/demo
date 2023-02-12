package com.fintech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fintech.dto.User;

@Repository
public interface OpenApiSpecificationRepo extends JpaRepository<User, Integer> {

	
}

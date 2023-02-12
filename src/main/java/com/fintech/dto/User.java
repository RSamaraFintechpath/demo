package com.fintech.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_table")
@Entity
public class User {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	private String phoneNumber;
	private String firstName;
	private String lastName;
	private String email;
	private String address;

}

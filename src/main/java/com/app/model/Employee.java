package com.app.model;


import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "EMPLOYEE_TBL_DTLS")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NonNull
	private String name;
	@NonNull
	private String mobileno;
	@NonNull
	private String email;
	@NonNull
	private String city;
	@NonNull
	private String state;
	@NonNull
	private String country;
	@NonNull
	private LocalDate createdAt;
}
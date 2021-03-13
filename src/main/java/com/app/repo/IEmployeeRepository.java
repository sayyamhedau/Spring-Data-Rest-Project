package com.app.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.model.Employee;

@Repository
public interface IEmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
	public Employee findByEmail(@Param("email") String email);

	public Employee findByMobileno(@Param("mobileno") String mobileno);
}
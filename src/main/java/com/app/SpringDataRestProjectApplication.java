package com.app;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.app.model.Employee;
import com.app.repo.IEmployeeRepository;

@SpringBootApplication
public class SpringDataRestProjectApplication {

	@Autowired
	private IEmployeeRepository employeeRepository;

	private static final Logger log = LoggerFactory.getLogger(SpringDataRestProjectApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestProjectApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		List<Employee> employeeList = Stream.of(
				new Employee("Sayyam Hedau", "8007390103", "sayyamhedau01@gmail.com", "Nagpur", "Maharashtra", "India",
						LocalDate.now(ZoneId.systemDefault())),
				new Employee("Anisha", "8007390111", "anisha@gmail.com", "Nagpur", "Maharashtra", "India",
						LocalDate.now(ZoneId.systemDefault())),
				new Employee("Pratiksha", "800223303", "pratiksha@gmail.com", "Nagpur", "Maharashtra", "India",
						LocalDate.now(ZoneId.systemDefault())))
				.collect(Collectors.toList());

		return args -> {
			employeeRepository.saveAll(employeeList);
			log.info("Employees Saved - {}", employeeList);
		};
	}
}

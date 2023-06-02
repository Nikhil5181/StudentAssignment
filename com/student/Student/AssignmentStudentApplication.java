package com.student.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.student.controller")
@EntityScan(basePackages = "com.student.dto")
@EnableJpaRepositories(basePackages =  "com.student.repo")


public class AssignmentStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentStudentApplication.class, args);
	}

}

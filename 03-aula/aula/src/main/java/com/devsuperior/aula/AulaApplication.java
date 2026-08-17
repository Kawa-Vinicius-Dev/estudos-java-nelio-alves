package com.devsuperior.aula;

import com.devsuperior.entities.Employee;
import com.devsuperior.services.SalaryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class AulaApplication implements CommandLineRunner {

	private SalaryService salaryService;

	public AulaApplication(SalaryService salaryService) {
		this.salaryService = salaryService;
	}

	public static void main(String[] args) {

	}
	@Override
	public void run(String... args) throws Exception {

		Employee employee = new Employee("Maria", 4000);
		System.out.println(employee);
	}

}

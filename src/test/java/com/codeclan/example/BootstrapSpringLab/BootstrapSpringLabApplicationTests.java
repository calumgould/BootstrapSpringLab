package com.codeclan.example.BootstrapSpringLab;

import com.codeclan.example.BootstrapSpringLab.models.Employee;
import com.codeclan.example.BootstrapSpringLab.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootstrapSpringLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateEmployee(){
		Employee roosa = new Employee("Roosa Päivänsalo", 27, 2711, "roosa.paivansalo@gmail.com");
		Employee calum = new Employee("Calum Gould", 23, 2402, "calumgould26@gmail.com");
		employeeRepository.save(roosa);
		employeeRepository.save(calum);
	}

}

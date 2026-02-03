package net.javaguides.springboot;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import org.jspecify.annotations.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
    @Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {

	System.out.println("Hello World");
//		Employee employee = new Employee();
//		employee.setFirstName("subham");
//		employee.setLastName("kumar");
//		employee.setEmailId("subham@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("subha1");
//		employee1.setLastName("singh");
//		employee1.setEmailId("subham1@gmail.com");
//		employeeRepository.save(employee1);

	}
}

package spring.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import spring.data.entity.Employee;
import spring.data.repository.EmployeeRepo;

@SpringBootApplication
public class SpringDataApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataApplication.class, args);
		
		 EmployeeRepo emp = context.getBean(EmployeeRepo.class);
		
		//System.out.println("------------------------------- "+emp.getClass().getName()+" ----------------------------------");
		Employee empl = new Employee();
//		empl.setId(100);
		empl.setName("broot");
		empl.setAge(230);
		
		emp.save(empl);
		
		context.close();
	}

}

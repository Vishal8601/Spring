package vishal.in;


import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import vishal.in.entity.Employee;
import vishal.in.repo.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args)
	{
		ConfigurableApplicationContext c=SpringApplication.run(Application.class, args);
		
		EmployeeRepository bean = c.getBean(EmployeeRepository.class);
		
		//Creating Object For Employee Class
		
//		Employee e1=new Employee(102, "Rudra Pratap Singh",200000.00, "Male", "Tex Prepare");
//		Employee e2=new Employee(103, "Ritik Singh",50000.00, "Male", "Software Architect");
//		Employee e3=new Employee(104, "Akash Singh",40000.00, "Male", "IAS");
//		Employee e4=new Employee(105, "Kishan Singh",  30000.00, "Male", "Software Architect");
//		Employee e5=new Employee(106, "Abhisek Singh", 20000.00, "Male", "Software Architect");
//		Employee e6=new Employee(107, "Siddharth Singh", 10000.00, "Male", "Software Architect");
//		Employee e7=new Employee(108, "Siddhant Singh", 70000.00, "Male", "Software Architect");
//		Employee e8=new Employee(109, "Shivani Verma", 800000.00, "Female", "Queen");
//        List<Employee> saveAll = bean.saveAll(Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8));
//		System.out.println("Inserted...");
//		Sort a = Sort.by("empSalary").ascending();	
		
		//pagination here
//		int pagesize=5;
//		PageRequest of = PageRequest.of(pagesize-1, 3);
//		Page<Employee> f = bean.findAll(of);
//		List<Employee> findAll = f.getContent();
//		
//		findAll.forEach(System.out::println);
		
//		Employee e1=new Employee();
//		e1.setEmpGender("Male");
//		Example<Employee> of = Example.of(e1);
//		List<Employee> findAll = bean.findAll(of);	
//		findAll.forEach(System.out::println);
		Employee e=new Employee();
		e.setDept("Enrollment Agent");
		e.setEmpGender("Male");
		
		e.setEmpName("Rudra Pratap Singh");
		e.setEmpSalary(100000.00);
		Employee save = bean.save(e);
	}

}

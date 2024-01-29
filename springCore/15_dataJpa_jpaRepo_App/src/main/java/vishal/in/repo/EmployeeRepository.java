package vishal.in.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import vishal.in.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
	

}

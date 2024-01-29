package vishal.in.service;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vishal.in.binding.Student;
import vishal.in.entity.StudentEntity;
import vishal.in.repository.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	public StudentRepo repo;
	
	public List<String> getCorses(){
		return Arrays.asList("Java","Python","UI","C Langauge","Databas");
		
	}
	public boolean saveStudent(Student student) {
		
		StudentEntity entity=new StudentEntity();
		
		BeanUtils.copyProperties(student, entity);
		entity.setTiming(Arrays.toString(student.getTiming()));
		
		repo.save(entity);
		
		return true;
		
	}

}

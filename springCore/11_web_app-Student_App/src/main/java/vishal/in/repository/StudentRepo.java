package vishal.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vishal.in.entity.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity, Integer>{

}

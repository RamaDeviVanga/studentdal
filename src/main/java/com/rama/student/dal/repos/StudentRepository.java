package com.rama.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.rama.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student,Long> {

	

	

}

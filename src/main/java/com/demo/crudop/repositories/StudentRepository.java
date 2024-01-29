package com.demo.crudop.repositories;

import org.springframework.data.repository.CrudRepository;

import com.demo.crudop.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}

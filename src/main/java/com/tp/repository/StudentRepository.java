package com.tp.repository;

import org.springframework.data.repository.CrudRepository;

import com.tp.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}

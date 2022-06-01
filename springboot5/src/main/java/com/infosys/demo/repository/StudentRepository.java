package com.infosys.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infosys.demo.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}

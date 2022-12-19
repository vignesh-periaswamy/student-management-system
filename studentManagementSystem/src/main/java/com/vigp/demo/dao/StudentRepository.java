package com.vigp.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vigp.demo.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}

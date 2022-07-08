package com.wiley.studentregistrationapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wiley.studentregistrationapp.model.Student;

@Repository
public interface Idao extends JpaRepository<Student, Long> {

}

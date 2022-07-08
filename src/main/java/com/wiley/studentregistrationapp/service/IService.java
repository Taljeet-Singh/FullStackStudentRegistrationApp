package com.wiley.studentregistrationapp.service;

import java.util.List;

import com.wiley.studentregistrationapp.model.Student;

public interface IService {
	List<Student> getAllStudents();
	void saveStudent(Student student);
}

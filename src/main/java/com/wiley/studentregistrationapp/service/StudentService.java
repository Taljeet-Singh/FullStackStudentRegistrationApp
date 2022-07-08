package com.wiley.studentregistrationapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiley.studentregistrationapp.dao.Idao;
import com.wiley.studentregistrationapp.model.Student;

@Service
public class StudentService implements IService {

	@Autowired
	private Idao dao;
	
	@Override
	public List<Student> getAllStudents() {
		return dao.findAll();
	}

	@Override
	public void saveStudent(Student student) {
		this.dao.save(student);
	}

}

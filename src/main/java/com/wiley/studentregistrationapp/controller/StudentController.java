package com.wiley.studentregistrationapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wiley.studentregistrationapp.model.Student;
import com.wiley.studentregistrationapp.service.IService;

@Controller
public class StudentController {
	
	@Autowired
	private IService service;
	
	@GetMapping(value = "/")
	public String view(Model model) {
		model.addAttribute("listStudents", service.getAllStudents());
		return "index";
	}
	
	@GetMapping(value = "/showStudentForm")
	public String showStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "newStudent";
	}
	
	@PostMapping(value = "/saveStudent")
	public String saveStudent(@ModelAttribute("student") Student student) {
		service.saveStudent(student);
		//return "index";
		// same as above
		return "redirect:/";
	}
	
}

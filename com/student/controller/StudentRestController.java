package com.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.dto.Student;
import com.student.repo.StudentRepo;

@RestController
public class StudentRestController {

	@Autowired
	StudentRepo sp;
	
	
	
	@PostMapping("/add")
	public String insertStudent(@RequestBody Student s) {
		
		if(sp.findById(s.getRollno()).isEmpty()) {
			sp.save(s);
			return "Student Add Successfully";
		}
		else
			return "Student already Exist";
	}
	
	
	@GetMapping("/getAll")
	public List<Student> getStudent(){
		return sp.findAll();
	}
	
	
	@GetMapping("/getStudent")
	public Object getStudent(@RequestParam int rollno) {
		Optional<Student> op =  sp.findById(rollno);
		
		if(op.isEmpty())
			return "Student not Found";
		else
			return op.get();
	}
	
	
	@PutMapping("/updateStudent")
	public String updateStudent(@RequestBody Student s) {
		
		Optional<Student> op = sp.findById(s.getRollno());
		
		if(op.isEmpty()) 
			return "Student Not found";
		else 
		{ 
			sp.save(s);
			return "Student Updated Successfully";
		}
	}
	
	
	@DeleteMapping("/deleteStudent")
	public String deleteStudent(@RequestParam int rollno) {
		
		if(sp.findById(rollno).isEmpty()) 
			return "Student not found , please enter valid Rollno or ID";
		else 
		{
			sp.deleteById(rollno);
			return "Student Deleted";
		}
		
	}
	
	
	
	
	
}

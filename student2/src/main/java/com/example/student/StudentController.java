package com.example.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController 
  {
	@Autowired
	private IStudentService studentservice;
	
	//to get all student list
	@GetMapping (value="/Student")
	
	List<Student>getStudentList()
	
	{
	  List<Student> Student = studentservice.studentdetails() ;
	  return Student;

}
    //to get student list through rno
	@GetMapping (value="/Student/{rno}")
	
	public Optional<Student> getStudentDetails(@PathVariable ("rno")int rno) 
	{
		 
		Optional<Student> Student = studentservice.getDetails(rno);
		return Student;
		}
		
		
	//to post student data in a list
	@PostMapping("/Student")  
	public Student addStudent (@RequestBody Student Student)  {
		
	return this.studentservice.addStudent(Student);
		 
	}
	
	
	// to delete student data from list
	@DeleteMapping ("/Student/{rno}")
	String deleteRno (@PathVariable("rno") int  rno ) 
	{
		 return studentservice.deleteRno(rno);
		
  }
	// to update student data in existing 
      
	@PutMapping("/Student")
	public Student updateStudent (@RequestBody Student Student )
	{
	studentservice.updateStudent(Student);
		return Student;
	}
	}
	
  

  

  
	
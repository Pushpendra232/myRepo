package com.example.student2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	@GetMapping (value="/student2")
	
	List<Student2>getStudent2List()
	
	{
	  List<Student2> student2 = studentservice.studentdetails() ;
	  return student2;

}
    //to get student list through rno
	@GetMapping (value="/student2/{rno}")
	
	public Student2 getStudentDetails(@PathVariable ("rno")int rno) 
	{
		 
		Student2 student2 = studentservice.getDetails(rno);
		return student2;
		}
		
		
	//to post student data in a list
	@PostMapping("/student2")  
	public Student2 addStudent (@RequestBody Student2 student2)  {
		
	return this.studentservice.addStudent(student2);
		 
	}
	
	
	// to delete student data from list
	@DeleteMapping ("/student2/{rno}")
	public String deleteRno (@PathVariable("rno") int  rno ) 
	{
		 return this.studentservice.deleteRno(rno);
		
  }
	// to update student data in existing 
      
	@PutMapping("/student2")
	public Student2 updateStudent (@RequestBody Student2 student2 )
	{
		this.studentservice.updateStudent(student2);
		return student2;
	}
	}
	
  

  

  
	
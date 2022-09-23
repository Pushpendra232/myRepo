package com.example.student;

import java.util.List;
import java.util.Optional;
public interface IStudentService 
  {
   
	
	Optional<Student> getDetails(int r);

	List<Student> studentdetails();
	
	
	 Student addStudent (Student b);
	 String deleteRno(int rno);

Student updateStudent(Student Student);
	 
	  ;
  }

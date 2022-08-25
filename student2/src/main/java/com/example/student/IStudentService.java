package com.example.student;

import java.util.List;
public interface IStudentService 
  {
   
	
	Student getDetails(int r);

	List<Student> studentdetails();
	
	
	 Student addStudent (Student b);
	 String deleteRno(int rno);

Student updateStudent(Student Student);
	 
	  ;
  }

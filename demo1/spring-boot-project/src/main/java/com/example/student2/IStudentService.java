package com.example.student2;

import java.util.ArrayList;
import java.util.List;
public interface IStudentService 
  {
   
	
	Student2 getDetails(int r);

	List<Student2> studentdetails();
	
	
	 Student2 addStudent (Student2 b);
	 String deleteRno(int rno);

Student2 updateStudent(Student2 student2);
	 
	  ;
  }

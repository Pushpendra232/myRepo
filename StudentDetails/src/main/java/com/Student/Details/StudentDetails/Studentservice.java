package com.Student.Details.StudentDetails;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Studentservice implements IstudentService 
{ 
	ArrayList<Student> student= new ArrayList<Student>();
    @Override
 
	public List<Student> studentdetails() {
	
		 student.add (new Student( 1,"alian",190,65.7,"pass"));
	        student.add (new Student( 2,"jay",148,58.8,"pass"));
	        student.add (new Student( 3,"neha",137,52.7,"pass"));
	        student.add (new Student( 4,"divya",60,30.4,"fail"));
	        student.add (new Student( 5,"ajay",240,85.9,"pass"));

	        return student;
	        
	        
	}
}


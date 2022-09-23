package com.Student.Details.StudentDetails;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController
{
	
	@Autowired
  private IstudentService studentservice ;
  
  @SuppressWarnings("unchecked")
@GetMapping (value= "/student ;")
  List<Student>getStudentList()
  {
	  
	  List<Student> student = studentservice.studentdetails();
	  List<Student> student1 =student.stream().filter( e -> e.getName().equalsIgnoreCase("jay")).collect(Collectors.toList());
	  return student1;
  }

}

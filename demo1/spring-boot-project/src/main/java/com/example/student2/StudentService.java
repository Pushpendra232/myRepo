package com.example.student2;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService 
{ 
	ArrayList<Student2> student= new ArrayList<Student2>();
    @Override
 
    //in below hard coded values are there 
	public List<Student2> studentdetails() {
	
		    student.add (new Student2(1,"alian",190,65.7,"pass"));
	        student.add (new Student2( 2,"jay",148,58.8,"pass"));
	        student.add (new Student2( 3,"neha",137,52.7,"pass"));
	        student.add (new Student2( 4,"divya",60,30.4,"fail"));
	        student.add (new Student2( 5,"ajay",240,85.9,"pass"));

	        return student;
	     }
	        
	      
			@Override
			public Student2 getDetails(int r)
			{
				int flag=0;
	            List<Student2>Studarraylist=studentdetails() ;
	            
	            for(Student2 student:Studarraylist)
	            {
	                if(student.rno.equals(r))
	                {
	                    return student;
	                }
	            }
	
				return null;
				}
				
			//adding student
			
			public Student2 addStudent (Student2 b) {
				student.add(b);
				return b;
			}
			
			//delete student from list
			
			public String deleteRno (int rno) 
			{
				student= (ArrayList<Student2>) student.stream().filter
						(Student2 ->Student2.getRno()!=rno).
						 collect(Collectors.toList());
				return "Student Deleted Sucessfuly";
			}
			
			//update the student data 
			
			public Student2  updateStudent(Student2 student2) 
			{
				student.forEach(e ->
				{
					if (e.getRno()==student2.rno)
			    {
			    e.setName(student2.getName());
			    	e.setTotal(student2.getTotal());
			       e.setStatus(student2.getStatus());
			       e.setPercent(student2.getPercent());
			    }
			       
			      
					
				});
				return student2;
			/*	student= student.stream().map(b->{
					    if (b.getRno()==rno)
					    {
					    	b.setName(student2.getName());
					    	b.setTotal(student2.getTotal());
					    }
					    
			
				})*/
			}	
				
}
				

				
			

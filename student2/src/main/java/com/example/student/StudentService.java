package com.example.student;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService 
{  
	@Autowired
    private StudentDao studentdao;
	
	ArrayList<Student> student= new ArrayList<Student>();
    @Override
 
    //in below hard coded values are there 
	public List<Student> studentdetails() {
	


        return studentdao.findAll();
	     }
	        
	      
			@Override
			public Student getDetails(int r)
			{

	            return studentdao.getOne(r);
				}
				
			//adding student
			
			public Student addStudent (Student b)
			{
				
				studentdao.save(b);
				return b;
			}
			
			//delete student from list
			
			public String deleteRno (int rno) 
			{
				Student entity = studentdao.getOne(rno);
				studentdao.delete(entity);
				return "Student Deleted Sucessfuly";
			
			}
			
			//update the student data 
			
			public Student  updateStudent(Student Student) 
			{

				studentdao.save(Student);
				return Student;
			/*	student= student.stream().map(b->{
					    if (b.getRno()==rno)
					    {
					    	b.setName(Student.getName());
					    	b.setTotal(Student.getTotal());
					    }
					    
			
				})*/
			}	
				
}
				

				
			

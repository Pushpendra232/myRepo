package com.example.student;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
	public List<Student> studentdetails() 
    {
        return studentdao.findAll();
	}
	        
	      
			@Override
			public Optional<Student> getDetails(int r)
			{

	            return studentdao.findById(r);
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
				Optional<Student> entity = studentdao.findById(rno);
				 if(entity.isPresent())
			        {
					 studentdao.delete(entity.get());
			            return "Account Deleted Sucessfully";
			        }
			        return "Accout not found"; 
			
			}
			
			//update the student data 
			
			public Student  updateStudent(Student Student) 
			{

				studentdao.save(Student);
				return Student;
			
			}	
				
}
				

				
			

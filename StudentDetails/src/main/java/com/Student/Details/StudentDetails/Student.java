package com.Student.Details.StudentDetails;
import java.util.*;
public class Student {

	    String name;
	    
	    int rno;
	   
	    int total;
	    double percent;
	    String status;
	   
	     Student(int r,String n ,int t,double p,String s)
	    {
	                       rno=r;
	                       name= n;
	                 
	                       total=t;
	                       percent=p;
	                       status=s;
	    }
	              
	    Student()
	    {

	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	    public int getTotal() {
	        return total;
	    }
	    
	    public void setTotal(int total) {
	        this.total = total;
	    }
	    
	    public double getPercent() {
	        return percent;
	    }
	    
	    
	    public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	      
		public void setPercent(float percent) {
	        this.percent = percent;
	    }
		
	
	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    public int getRno() {
	        return rno;
	    }
	    
	    public void setRno(int rno) {
	        this.rno = rno;
	    }
	    

	   @Override
	                public int hashCode() {
	                return Objects.hash( name, rno);
	    }
	               
	    @Override
	       public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        Student other = (Student) obj;
	        return Objects.equals(name, other.name) && rno == other.rno;
	    }

	}



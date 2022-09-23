package com.example.student2;

import java.util.Objects;

public class Student2 {

	    String name;
	    
	   Integer rno;
	   
	    int total;
	    double percent;
	    String status;
	   
	     Student2(int r,String n ,int t,double p,String s)
	    {
	                       rno=r;
	                       name= n;
	                 
	                       total=t;
	                       percent=p;
	                       status=s;
	    }
	              
	    Student2()
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
	      
		public void setPercent(double percent) {
	        this.percent = percent;
	    }
		
	
	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    public Integer getRno() {
	        return rno;
	    }
	    
	    public void setRno(Integer rno) {
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
	        Student2 other = (Student2) obj;
	        return Objects.equals(name, other.name) && rno == other.rno;
	    }

	}

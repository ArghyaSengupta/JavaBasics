package com.oops.examples;

//inheritence: child : programmer, parent :employee
class Programmer extends Employee{  
	 int bonus=10000;//characteristic feature: bonus	
	 public static void main(String args[])

	 
	 { 
		 //new helps us to create object of the class?
		 //child class
	   Programmer p=new Programmer();//object of the same class
	   //+ : concatenate : combine
	   //. is used to refer to the object of the class
	   //. is used to refer to the features of the class
	   System.out.println("Programmer salary is:"+p.salary);  
	   System.out.println("Bonus of Programmer is:"+p.bonus); 
	   System.out.println("Name of the programmer is:"+p.name);
	   System.out.println("EmployeeID of the programmer is:"+p.employeeID);
	   System.out.println("Salary of the programmer is:"+p.calculateSalary());
	   //child object tries to use both the parent features
	   //child features
	}  
}

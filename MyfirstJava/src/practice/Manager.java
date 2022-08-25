package practice;
//manager (is a) employee:Inheritence
//extends Employer : Manager is a child of Employer class
public class Manager extends Employee {
	//since parent class 
	//already implements the interface so 
	//the child class shall not do it again
  public static void main(String a[]) {
	  //object is encapsulating the prop and beh fo parent class
	Employee newEmployee = new Employee();//object
	//object creation
	//this creates an object of Employee parent class
	//object : access all prop and beh of the parent class
	newEmployee.test1=10;//protected prop
	newEmployee.test2=10;//public prop
	newEmployee.checkAccess1();//public  beh -child2
    newEmployee.checkAccess2();//protected beh
	    }

}

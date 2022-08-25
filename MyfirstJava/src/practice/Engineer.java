package practice;

//engineer is a employee
//engineer: child class
//employee : parent class
public class Engineer extends Employee{
	public static void main(String a[]) {
	
	Engineer engineer= new Engineer();//child obj
	Employee employee=new Employee();//parent obj
	
	employee.checkAccess1();//call from child1
	}

}

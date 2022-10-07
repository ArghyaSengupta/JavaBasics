package OOps;

public class Employee extends Employer
//child:employee, (extends) parent:employer :inheritence
//so that child can use the props and behavs of the parent class
{

	//abstract int mileage();
	//method is used for i/o or any run time java operations
	public static void main(String a[]) {
	Employer emp= new Employer();
	//encapsulating the props and behavs
	//emp.getName();//private members cannot be accessed
	emp.getSalary();//public: anyone anywhere can access it
	emp.getEmpID();//protected : within the same package:OOps
}
}

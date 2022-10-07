package OOps;

public class Employer {
	
	String name;//prop1
	int salary;//prop2
	int empID;
	protected int getEmpID() {
		return empID;
	}
	protected void setEmpID(int empID) {
		this.empID = empID;
	}
	//public , private or protected : access specifiers
	//behaviours are the functions/methods using the properties
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	

}

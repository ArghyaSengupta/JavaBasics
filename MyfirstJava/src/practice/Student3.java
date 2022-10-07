package practice;

public class Student3 {
	// private data member- properties/states
	//public()global)/private(restricted) and protected (available only for the same package)
	private String name;
	private String college = "AKG";

	// getter method for name
	public String getName() {
		return name;
	}

	// setter method for name
	public void setName(String name) {
		this.name = name;
	}
	
	

	public String getCollege(){  
		return college;  
		}  
	public void setCollege(String college) {
		this.college = college;
}
}

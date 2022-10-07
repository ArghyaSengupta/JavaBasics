package practice;

class Programmer extends Employee {
	int bonus = 10000;

	//int calcAmount();
	public static void main(String args[]) {
		//child object should be created before apying behvaiours from parent
		Programmer p = new Programmer();
		//Classname obj= new Classname();
		System.out.println("Programmer salary is:" + p.salary);
		System.out.println("Bonus of Programmer is:" + p.bonus);
	}
}
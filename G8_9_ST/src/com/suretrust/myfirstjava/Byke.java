package com.suretrust.myfirstjava;//pkg name


//is a Vehcile :inheritence
//Child
//extends : to indicate inheritence

//Byke is a vehicle
//methods are created in chilren classes
public class Byke extends Vehicle implements TestInterface{

	int mileage=20;//object1 or variable1
	String brake="1d";//object2 or variable 2
	//whatever are the charactyeristocs of Byke are mentioned here
	void name()//method 1 
	{
		System.out.println("I am a byke");
	}
	
	int mileage(int mileageofByke) //method2
	{
		
		return mileageofByke;
	}
	
	int numberOfTyres() {
		return 2;
	}
	public static void main(String args[]) {
	//you write here will be executed
		//one main method inside a single project
		
		
	
}

	@Override
	public String color() {
		// TODO Auto-generated method stub
		return "blue";
	}

}
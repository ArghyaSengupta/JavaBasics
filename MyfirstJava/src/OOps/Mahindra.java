
package OOps;

public class Mahindra extends Car{

	@Override
	int mileage() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	String color() {
		// TODO Auto-generated method stub
		return "blue";
	}

}
package OOps;
// parent class 'car' child class 'mahindra'
//extends means 'inheritence'
public class Mahindra extends Car{

	//we have to decide how mahindra is a car
	//to do that the milage should be unique
	//for example milage of mahindra is 20
	//this milage value is hidden from any other type of car
	@Override
	int mileage() {
		// TODO Auto-generated method stub
		return 10; //value is a number so milage is int 
	}
@Override
String color()  {
	return "red";
}

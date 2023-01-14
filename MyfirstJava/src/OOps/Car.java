
package OOps;

public abstract class Car {
	
	abstract int mileage();
	abstract String color();

}
package OOps;
//abstract key word hepls in data hiding
//any type of car will not come to know about other type of car
//for example car a and car b will not know about each other
// abstract class is also known as imcomplete class bcz it is depending upon child class
public abstract class Car {

//this is an abstract method 'milage'
	//a method is abstract when any child class of a parent class have different values
	//abstract 'hide the milage'
	//int 'unit'
	// milage () 'this is a method'
	//method is behaviour
	abstract int mileage();
	abstract String color()

}

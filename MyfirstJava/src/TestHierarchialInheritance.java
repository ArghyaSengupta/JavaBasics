
//hierarchial inheritance allows
//immediate parent to be accessed
public class TestHierarchialInheritance {
	
	public static void main(String args[]) {
	Cat c= new Cat();
	c.meow();
	c.eat();
	//c.bark()//
	
	Dog dog= new Dog();
	dog.bark();
	dog.eat();
	}
}

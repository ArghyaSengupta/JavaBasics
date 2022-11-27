
//multi-level : child class can access all the
//previous level parents
public class TestMultilevelInheritence {

	public static void main(String args[]) {
		
		Baby b= new Baby();
		b.eat();
		b.weep();
		
		School school= new School();
		school.standard();
		school.eat();
		school.weep();
	}
}

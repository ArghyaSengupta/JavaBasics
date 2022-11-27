
public class Test2 implements Showable,printable{

	@Override
	public void show() {
		System.out.println("Hello");//executed
		
	}

	@Override
	public void print() {
		System.out.println("Welcome");//executed
		
	}

	public static void main(String args[]) {
		
		Test2 t1= new Test2();
		t1.print();
		t1.show();
	}
}

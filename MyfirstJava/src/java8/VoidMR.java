package java8;
import java.util.ArrayList;
import java.util.List;

public class VoidMR {
	
	public static void foo() {
		System.out.println("foo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Runnable> list=new ArrayList<>();
    list.add(VoidMR::foo);
    for(Runnable runTest:list) {
	runTest.run();
   }
	}
	
	

}

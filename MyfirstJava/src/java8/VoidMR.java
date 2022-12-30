package java8;
import java.util.ArrayList;
import java.util.List;

public class VoidMR {
	
	public static void foo() {
		System.out.println("foo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Runnable> list=new ArrayList<>();//type of Runnable
    list.add(VoidMR::foo);//void method added by the property of Runnable functional
    //interface
    for(Runnable runTest:list) {
	runTest.run();//run the thread
   }
	}
	
	

}

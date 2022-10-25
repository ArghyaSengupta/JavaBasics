package SummaryJava;

public class ConstructorOverload {
	
	
	ConstructorOverload(){
		System.out.println("Constructor1");
	}
	
	ConstructorOverload(int a,int b){
		System.out.println("Constructor2");
	}
	
	ConstructorOverload(String a, String b){
		System.out.println("Constructor3");
	}
	
	public static void main(String a[]) {
		
		ConstructorOverload a1= new ConstructorOverload();//1
		ConstructorOverload b= new ConstructorOverload(0, 0);//2
		ConstructorOverload c= new ConstructorOverload("test", "test");//3
	}

}

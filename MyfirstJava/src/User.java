
public class User implements printable{

	public void print() {
		System.out.println("Hello");
	}
	
	public static void main(String args[]) {
		
		User user= new User();
		user.print();
	}
}

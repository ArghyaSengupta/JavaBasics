
public class TestInterface {

	public static void main(String args[]) {
		
		Drawable d=new Circle();
		d.draw();
		Drawable d1= new Rectangle();
		d1.draw();
		Bank bank= new PNB();
		System.out.println(bank.rateOfInterest());
		Bank bank2= new SBI();
		System.out.println(bank2.rateOfInterest());
		
	}
}

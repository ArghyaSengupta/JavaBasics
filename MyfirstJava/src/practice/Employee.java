/**
 * 
 */
package practice;

/**
 * @author Arghya
 *
 */
//implementation class
//class:Employee
//Company: interface
//keyword:implements helps to use interface Company
//Child:Employee and parent is Employer
public class Employee  implements Company{
	//properties /member variables
	private int test=0;// it cannot be used outside this class neither it will be visible
	protected int test1=0;//it can be used inside the same package
	public int test2=0;//this can be used or acesssed from anywhere

	@Override
	public String department() //behaviour1
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int empdID()//behaviour2 {
	{	
	// TODO Auto-generated method stub
		return 0;
	}

	private int checkAccess()//behaviour1 {
		{return 0;
	}
  public int checkAccess1() //behaviour1{
	  {return 10;
  }
  protected int checkAccess2()//behaviour1 {
	  {return 10;
  }

}

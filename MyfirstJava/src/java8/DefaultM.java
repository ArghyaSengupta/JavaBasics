package java8;

interface TestInterface
{
    // abstract method
    public void square(int a);
  
    // default method
    default String show(int a)
    {
      //System.out.println("Default Method Executed");
      return "1";
    }
    
    
}
  
class DefaultM implements TestInterface
{
    // implementation of square abstract method
   public void square(int a)
    {
        System.out.println(a*a);
    }
  
    public static void main(String args[])
    {
    	DefaultM d = new DefaultM();
        d.square(4);
  
        // default method executed
        d.show(4);
    }
}
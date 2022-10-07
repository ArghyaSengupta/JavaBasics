package java8;
interface TestInterface2
{
    // abstract method
    public void square (int a);
  
    // static method
    static void show()
    {
        System.out.println("Static Method Executed");
    }
}
  
class DefaultM2 implements TestInterface2
{
    // Implementation of square abstract method
    public void square (int a)
    {
        System.out.println(a*a);
    }
  
    public static void main(String args[])
    {
    	DefaultM2 d = new DefaultM2();
        d.square(4);
  
        // Static method executed
        TestInterface2.show();
    }
}
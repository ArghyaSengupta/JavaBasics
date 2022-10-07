package practice;

class ExceptionCheck {
    public static void main (String[] args) {
      int a=5,b=0;//b=1
      //final int a1=7;//constant
      //final String test="saregama";//constant
      //int b=0;
      //place of ambiguity 
      try{
          System.out.println(a/b);//??--point of termination
          //System.out.println("i am here");//unreachable code??-- address this statement
        }
      //acknowledge the exception
      catch(Exception e){
        e.printStackTrace();//adds the exception in console
      }
      //universal block that executes everytime
       finally {
        	System.out.println("I will be there even if no one is there");
        }
    }
}

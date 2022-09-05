package practice;


//recursion:
//calling the same task till the process completes
//Java program to check whether a number
//is prime or not using recursion
class PrimeBest{
	
static int i = 2;

//Function check whether a number
//is prime or not
public static boolean isPrime(int n)
{
	
	// Corner cases
	if (n == 0 || n == 1)
	{
		return false;
	}

	// Checking Prime
	if (n == i)
		return true;
		
	// Base cases
	if (n % i == 0)
	{
		return false;
	}
	i++;
	return isPrime(n);//recursion: calling one module with start and end
}

//Driver Code
public static void main(String[] args)
{
	//o(n)-o(1)
	//for(int i=0;i<n;i++) 
	//{
	if (isPrime(34))//data:34,info:number
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}
//}
}
}

//This code is contributed by divyeshrabadiya07


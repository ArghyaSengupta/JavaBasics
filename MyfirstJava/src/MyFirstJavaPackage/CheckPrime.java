package MyFirstJavaPackage;

class CheckPrime {

	static int i = 2;

	// Function check whether a number
	// is prime or not
	public static boolean isPrime(int n)
	{

		// Corner cases
		if (n == 0 || n == 1) {
			return false;
		}

		// Checking Prime
		if (n == i)
			return true;

		// Base cases
		if (n % i == 0) {
			return false;
		}
		i++;
		return isPrime(n);
	}

	// Driver Code
	public static void main(String[] args)
	{
		if (isPrime(35)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}

//This code is contributed by divyeshrabadiya07


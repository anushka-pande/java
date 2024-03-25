class Factorial {
	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		int n = 6;
		factorial.calculateFactorial(n);
	}
	public int calculateFactorial(int n) {
		int factorial = 1;
		if (n < 0) {
			System.out.println("Error!!! Factorial of negative number doesn't exist.");
		}
		else {
			for(int i = 1; i <= n; ++i) 
			{
				factorial *= i; 
			}
			System.out.println("Factorial = " + factorial);
		}
		return 0;
	}
}

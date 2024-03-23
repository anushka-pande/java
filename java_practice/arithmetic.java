class Arithmetic {
	public static void main(String[] args) {
		double a = 5.9,b = 7.3;
		double sum, diff, mul, div, mod;
		
		int x = 20, y = 9;
		int post_inr, post_dcr, pre_inr, pre_dcr;
		
		sum = a + b;
		System.out.println("Sum of two numbers = " + sum);
		
		diff = a - b;
		System.out.println("Difference of two numbers = " + (float)diff);
		
		mul = a * b;
		System.out.println("Multiplication of two numbers = " + mul);
		
		div = a / b;
		System.out.println("Division of two numbers = " + div);
		
		mod = x % y;
		System.out.println("Modulus of two numbers = " + mod);
		
		post_inr = x++;
		System.out.println("Post Increment = " + post_inr);
		
		pre_inr = ++x;
		System.out.println("Pre Increment = " + pre_inr);
		
		post_dcr = y--;
		System.out.println("Post Decrement = " + post_dcr);
		
		pre_dcr = --y;
		System.out.println("pre Decrement = " + pre_dcr);
	}
}

class Sum {
	public double add(double num1,double num2) {
		return num1 + num2;
	}
	public static void main(String[] args) {
		Sum sum = new Sum();
		
		double result = sum.add(4.3827,5.277);
		
		System.out.println("Sum of two numbers = " + result);
	}
}

class LargestNum {
	public static void main(String[] args) {
		double a = 5.39, b = 9.49, c = 11.38;
		
		if(a >= b && a >= c) {
			System.out.println(a + " is the largest number");
		}
		else if(b >= a && b >= c) {
			System.out.println(b + " is the largest number");
		}
		else {
			System.out.println(c + " is the largest number");
		}
	}
}

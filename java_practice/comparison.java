class Comaprison {
	public static void main(String[] args) {
		double m = 20.187, n = 20.187;
		if(m != n) {
			System.out.println("m is not equal to n");
			if(m > n) {
				System.out.println("m is greater than n");
			}
			else if(m < n) {
				System.out.println("m is less than n");
			}
		}
		else if(m == n) {
			System.out.println("m is equal to n");
		}
		
	}
}

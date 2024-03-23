class EvenOdd {
	public static void main(String[] args) {
		EvenOdd N = new EvenOdd();
		double number = 5.30;
		
		if(N.isEven((int)number)) {
			System.out.println(number + " is Even");
		}
		else {
			System.out.println(number + " is Odd");
		}
	}
	public boolean isEven(int num) {
		return num % 2 == 0;
	}
}

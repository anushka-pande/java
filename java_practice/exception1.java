class Divideby0 {
	public static void main(String[] args) {
		Divideby0 a = new Divideby0();
		a.divide(25, 0);
		//System.out.println(a.convertMixedtoImproper(7, 1, 0));
	}
	public void divide(long dividend, long divisor) {   //division method that takes two numbers and return their quotient
		long quotient = 1;
		try {
			System.out.println(quotient = dividend / divisor);
		}
		catch(Exception e) {
			System.out.println(e.fillInStackTrace());
			//System.out.println("Divide by 0 Exception found");
		}
		//return quotient;
    	}
    	
    	
    	
}

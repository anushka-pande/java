class SI {
	public static void main(String[] args) {
		SI simpleInt = new SI();
		System.out.println(simpleInt.calculateSI(1000,0.5,2));
	}
	public double calculateSI(double Principle, double Rate, int timePeriod) {                  //timePeriod is in years
		double simpleInterest = (Principle * Rate * timePeriod) / 100;
		return simpleInterest;
	}
}

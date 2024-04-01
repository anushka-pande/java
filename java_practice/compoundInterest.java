class CI {
	public static void main(String[] args) {
		CI compoundInt = new CI();
		System.out.println(compoundInt.calculateCI(1200, 5.4, 2));
	}
	public double calculateCI(double Principle, double Rate, int timePeriod) {
		double Amount = Principle * (Math.pow((1 + Rate / 100),timePeriod));
		System.out.println(Amount);
		double compoundInterest = Amount - Principle;
		return compoundInterest;
	}
}

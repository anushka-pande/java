class Temperature {
	public double convertCelsiusToFahrenheit(double C) {
		double F = (9.0 / 5.0) * C + 32.0;
		return F; 
	}
	public double convertFahrenheitToCelsius(double F) {
		double C = (5.0 / 9.0) * (F - 32.0);
		return C; 
	}
	public static void main(String[] args) {
		Temperature temp = new Temperature();
		
		System.out.println("Conversion of Celsius To Fahrenheit: F = " + temp.convertCelsiusToFahrenheit(5));
		System.out.println("Conversion of Fahrenheit To Celsius: C = " + temp.convertFahrenheitToCelsius(41));
	}
}

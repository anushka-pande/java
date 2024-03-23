class Complex {
	double real;
	double imaginary;
	Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	public Complex add(Complex C) {
		double realPart = this.real + C.real;
		double imaginaryPart = this.imaginary + C.imaginary;
		return new Complex(realPart, imaginaryPart);
	}
	public String toString() {
		return "(" + real + "+" + imaginary + "i)";
	}
	public static void main(String[] args) {
		Complex num1 = new Complex(5,3);
		Complex num2 = new Complex(7,5);
		
		Complex sum = num1.add(num2);
		
		System.out.println("Sum = " + sum);
	}
}

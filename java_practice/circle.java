class Circle {
	public double calculateArea(double radius) {
		double piApprox = 3.14159;
		return piApprox * radius * radius;
	}
	public static void main(String[] args) {
		Circle circle = new Circle();
		
		double area = circle.calculateArea(5);
		
		System.out.println("Area = " + area);
	}
}

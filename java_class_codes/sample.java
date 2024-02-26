class Father {
	int balance = 123;
	String surname;
	public Father() {
		
		balance = 456;
		System.out.println("Inside default constructor");
	}
	public Father(int balance) {
		this();
		balance = balance;
		System.out.println("Inside parameterized constructor");
	}
	public static void main(String[] args) {
		Father daughter = new Father(789);
		System.out.println(daughter.balance);
		System.out.println(daughter.surname);
	}
}

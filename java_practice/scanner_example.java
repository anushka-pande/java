import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the username, age and salary: ");
		
		String userName = obj.nextLine();                      //Reads string
		int age = obj.nextInt();                               //Reads Integer
		double salary = obj.nextDouble();
		
		System.out.println("Username: " + userName);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
	}
}

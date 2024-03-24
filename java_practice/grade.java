class Grades {
	public static void main(String[] args) {
		char grade = 'F';
		
		Grades G = new Grades();
		
		G.displayResult(grade);
	}
	public void displayResult(char grade) {
		switch(grade) {
			case 'A':
				System.out.println("Excellent! You got 'A' grade.");
				break;
			case 'B':
				System.out.println("Well Done! You got 'B' grade.");
				break;
			case 'C':
				System.out.println("Try Better Next Time ! You got 'C' grade.");
				break;
			case 'D':
				System.out.println("You Passed ! You got 'D' grade.");
				break;
			case 'F':
				System.out.println("You Fail ! You got 'F' grade.");
				break;
			default:
				System.out.println("Incvalid Grade !");
		}
	}
}

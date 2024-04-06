import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
class LibraryUser {
	String name;
	int id;
	boolean isStudent;
	boolean isPenaltyPaid;
	boolean isBookAvailable;
	int amount;
	int extraDays;
	int issuedBooks;
	
	public LibraryUser(String name,int id, boolean isStudent) {
		this.name = name;
		this.id = id;
		this.isStudent = isStudent;
		this.extraDays = 0;
		this.issuedBooks = 0;
		this.isPenaltyPaid = isPenaltyPaid;
	        this.isBookAvailable = isBookAvailable;
	}
	public boolean paypenalty() {
		if(isPenaltyPaid) {
			System.out.println("You have already paid the penalty.");
			return true;
		}
		else {
			System.out.println("Penalty amount: $" + amount);
			System.out.println("Penalty paid successfully");
			isPenaltyPaid = true;
			return false;
		}
	}
	public int checkpenalty() {
		amount = 2 * extraDays;
		if(isPenaltyPaid) {
			System.out.println("No pending penalty");
			return 0;
		}
		else {
			System.out.println("Penalty amount: $" + amount);
			return amount;
		}
	}
	public boolean checkAvailabilityStatus(String BookId) {
		if(isBookAvailable) {
			return true;
		}
		else {
			return false;
		}
	}
	public int checkIssuedBooks() {
		return issuedBooks;
	}
}
class Student extends LibraryUser {
	public Student(String name,int id) {
		super(name,id,true);
	}
}
class Faculty extends LibraryUser {
	public Faculty(String name,int id) {
		super(name,id,false);
	}
}
class LibraryStaff extends LibraryUser {
	public LibraryStaff(String name,int id) {
		super(name,id,false);
	}
	public String issueBook(String BookId) {
		int days = isStudent ? 15 : 20;
		extraDays = days;
		LocalDate currentDate = LocalDate.now();
		LocalDate dueDate = currentDate.plusDays(days);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formattedDueDate = dueDate.format(formatter);
		issuedBooks++;
		return formattedDueDate;
	}
	public String renewBook(String BookId) {
		int days = isStudent ? 15 : 20;
		extraDays += days;
		LocalDate currentDate = LocalDate.now();
		LocalDate newdueDate = currentDate.plusDays(days);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formattedNewDueDate = newdueDate.format(formatter);
		return formattedNewDueDate;
	}
	public boolean returnBook(String BookId) {
		if (issuedBooks > 0) {
        		issuedBooks--;
        		return true;  
    		} 
    		else {
        		return false; 
    		}
	}
}
class LibraryManagementSystem {
	public static void main(String[] args) {
		Student student = new Student("Anushka",42);
		Faculty faculty = new Faculty("Prof.XYZ",392);
		LibraryStaff staff = new LibraryStaff("Librarian",2992);
		
		String DueDate = staff.issueBook("B001");
		String NewDueDate = staff.renewBook("B001");

		System.out.println(DueDate);
        	System.out.println(NewDueDate);
        	System.out.println(student.paypenalty());
        	System.out.println(student.checkpenalty());
        	System.out.println(staff.checkIssuedBooks());
        	System.out.println(staff.returnBook("B001"));
        	System.out.println(staff.checkIssuedBooks());
	}
}

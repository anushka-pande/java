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
			System.out.println("The book is available for issue.");
			return true;
		}
		else {
			System.out.println("The book is currently not available.");
			return false;
		}
	}
	public int checkIssuedBooks() {
		System.out.println("Number of books issued:" + issuedBooks);
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
		isBookAvailable = false;
		System.out.println("Book issued successfully. Return by: " + formattedDueDate);
		return formattedDueDate;
	}
	public String renewBook(String BookId) {
		int days = isStudent ? 15 : 20;
		extraDays += days;
		LocalDate currentDate = LocalDate.now();
		LocalDate newdueDate = currentDate.plusDays(days);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formattedNewDueDate = newdueDate.format(formatter);
		System.out.println("Book renewed successfully. New Due Date: " + formattedNewDueDate);
		return formattedNewDueDate;
	}
	public boolean returnBook(String BookId) {
		if (issuedBooks > 0) {
        		issuedBooks--;
        		isBookAvailable = true;
        		System.out.println("Book returned successfully.");
        		return true;  
    		} 
    		else {
    			System.out.println("No books issued to return");
        		return false; 
    		}
	}
}
class LibraryManagementSystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student("Anushka",42);
		Faculty faculty = new Faculty("Prof.XYZ",392);
		LibraryStaff staff = new LibraryStaff("Librarian",2992);
		
		System.out.println("Welcome to the Library Management System!");
		
		//String DueDate = staff.issueBook("B001");
		//String NewDueDate = staff.renewBook("B001");

		//System.out.println(DueDate);
        	//System.out.println(NewDueDate);
        	//System.out.println(student.paypenalty());
        	//System.out.println(student.checkpenalty());
        	//System.out.println(staff.checkIssuedBooks());
        	//System.out.println(staff.returnBook("B001"));
        	//System.out.println(staff.checkIssuedBooks());
        	
        	
		while (true) {
		    System.out.println("\nChoose an option:");
		    System.out.println("1. Issue a book");
		    System.out.println("2. Renew a book");
		    System.out.println("3. Return a book");
		    System.out.println("4. Check penalty");
		    System.out.println("5. Exit");

		    int choice = scanner.nextInt();
		    scanner.nextLine(); 

		    switch (choice) {
		        case 1:
		            System.out.println("Enter the book ID to issue:");
		            String issueBookId = scanner.nextLine();
		            staff.issueBook(issueBookId);
		            break;
		        case 2:
		            System.out.println("Enter the book ID to renew:");
		            String renewBookId = scanner.nextLine();
		            staff.renewBook(renewBookId);
		            break;
		        case 3:
		            System.out.println("Enter the book ID to return:");
		            String returnBookId = scanner.nextLine();
		            staff.returnBook(returnBookId);
		            break;
		        case 4:
		            staff.checkpenalty();
		            break;
		        case 5:
		            System.out.println("Exiting...");
		            System.exit(0);
		            break;
		        default:
		            System.out.println("Invalid choice. Please enter a number between 1 and 5.");
		    }
		}
	}
}

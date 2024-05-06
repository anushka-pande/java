import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Book {
	private String id;
	private String title;
	
	public Book(String id, String title) {
		this.id = id;
		this.title = title;
	}
	public String getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
}

class Library {
	private List<Book> books;
	
	public Library() {
		this.books = new ArrayList<>();
	}
	
	public void addBook(String bookId, String bookTitle) {
		boolean exists = false;
		for(Book book : books) {
			if(book.getId().equals(bookId)) {
				exists = true;
				break;
			}
		}
		if(!exists) {
			books.add(new Book(bookId, bookTitle));
			System.out.println("Book with Id " + bookId + " and name '" + bookTitle + "' added to the library.");
		}
		else {
			System.out.println("Book with Id " + bookId + " already exists in the library");
		}
	}
	
	public void removeBook(String bookId) {
		for(Book book : books) {
			if(book.getId().equals(bookId)) {
				books.remove(book);
				System.out.println("Book with Id " + bookId + " removed from the library.");
				return;
			}
		}
		System.out.println("Book wiht Id " + bookId + " not found in the library.");
	}
}

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
	
	public boolean payPenalty() {
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
	
	public int checkPenalty() {
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
	
	public boolean checkAvailabilityStatus(String BookId, String BookTitle) {
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
	private Library library;
	
	public LibraryStaff(String name,int id, Library library) {
		super(name,id,false);
		this.library = library;
	}
	
	public void addBook(String bookId, String bookTitle) {
		library.addBook(bookId, bookTitle);
	}
	
	public void removeBook(String bookId) {
		library.removeBook(bookId);
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
		Library library = new Library();
		
		System.out.println("Welcome to the Library Management System!");

        	System.out.println("Are you a:");
		System.out.println("1. Student");
		System.out.println("2. Faculty");
		System.out.println("3. Library Staff");
		int userRole = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		System.out.println("Enter your ID: ");
		int id = scanner.nextInt();
		
		LibraryUser user = null;
		switch(userRole) {
			case 1: 
				user = new Student(name, id);
				break;
			case 2: 
				user = new Faculty(name, id);
				break;
			case 3: 
				user = new LibraryStaff(name, id, library);
				break;
			default:
				System.out.println("Invalid choice. Exiting...");
				System.exit(0);
		}
        	 
        	System.out.println("Welcome " + name + " !!");
        	
        	
        	LibraryStaff staff = new LibraryStaff(name, id, library);
        	
		while (true) {
		    System.out.println("Choose an option:");
		    System.out.println("1. Issue a book");
		    System.out.println("2. Renew a book");
		    System.out.println("3. Return a book");
		    System.out.println("4. Check penalty");
		    if(userRole == 3) {
		    	System.out.println("5. Add a new book");
		    	System.out.println("6. Remove a book");	
		    }
		    System.out.println("7. Pay penalty");
		    System.out.println("8. Check Availability Status of Book");
		    System.out.println("9. Check number of books issued");
		    System.out.println("10. Exit");

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
				staff.checkPenalty();
				break;
		        case 5:
		            	if(userRole == 3) {
		            		System.out.println("Enter the book ID and Title to add:");
					String addBookId = scanner.nextLine();
					String addBookTitle = scanner.nextLine();
					staff.addBook(addBookId, addBookTitle);
		            	}
				else {
					System.out.println("Invalid choice. Please enter a number between 1 and 7.");
				}
				break;
	                case 6:
	                	if(userRole == 3) {
	                		System.out.println("Enter the book ID to remove:");
					String removeBookId = scanner.nextLine();
					staff.removeBook(removeBookId);
	                	}
				else {
					System.out.println("Invalid choice. Please enter a number between 1 and 7.");
				}
				break;
			case 7:
				staff.payPenalty();
				break;
			case 8:
				System.out.println("Enter the book ID and Title whose status you want to check.");
				String checkBookId = scanner.nextLine();
				String checkBookTitle = scanner.nextLine();
				staff.checkAvailabilityStatus(checkBookId, checkBookTitle);
				break;
			case 9:
				staff.checkIssuedBooks();
				break;
			case 10:
				System.out.println("Exiting...");
				System.exit(0);
				break;
		        default:
				System.out.println("Invalid choice. Please enter a number between 1 and 7.");
		    }
		}
	}
}

import java.util.Scanner;

class LinearSearch {
	void search(int[] arr, int n, int x) {
		int i;
		boolean found = false;
		
		for(i = 0; i < n; i++) {
			if(arr[i] == x) {
				System.out.println("Element is found at index: " + i);
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("Element not found");
		}
	}
	public static void main(String[] args) {
		LinearSearch linearsearch = new LinearSearch();
		Scanner scanner = new Scanner(System.in);
		
		int n, x, i;
		System.out.println("Enter number of elements of array: ");
		n = scanner.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements: ");
		for(i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Enter element which is to be found");
		x = scanner.nextInt();
		linearsearch.search(arr, n, x);
	}
} 

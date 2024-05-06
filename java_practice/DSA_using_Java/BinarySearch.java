import java.util.Scanner;

public class BinarySearch {

    int binarySearch(int[] arr, int n, int x) {
        int start = 0, end = n - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
    	BinarySearch bsearch = new BinarySearch();
        Scanner scanner = new Scanner(System.in);
        
        int i, n, x;
        System.out.println("Enter number of elements:");
        n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.println("Enter the element to be searched:");
        x = scanner.nextInt();
        
        int result = bsearch.binarySearch(arr, n, x);
        
        if (result != -1) {
            System.out.println("Element " + x + " found at index " + result + ".");
        } else {
            System.out.println("Element " + x + " is not found in the array.");
        }
    }
}


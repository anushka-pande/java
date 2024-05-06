import java.util.Scanner;

public class MergeArray {
	void merge(int[] a1, int n, int[] a2, int m, int[] a3) {
		int i = 0, j = 0, k = 0;
		while(i < n && j < m) {
			if(a1[i] < a2[j]) {
				a3[k] = a1[i];
				i++;
 			}
 			else {
 				a3[k] = a2[j];
 				j++;
 			}
 			k++;
		}
		while(i < n) {
			a3[k] = a1[i];
			i++;
			k++;
		}
		while(j < m) {
			a3[k] = a2[j];
			j++;
			k++;
		}
	}
	public static void main(String[] args) {
		MergeArray mergearray = new MergeArray();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array1: ");
		int n = scanner.nextInt();
		System.out.println("Enter " + n + " elements for array1: ");
		int[] a1 = new int[n];
		for(int i = 0; i < n; i++) {
			a1[i] = scanner.nextInt();
		}
		System.out.println("Enter the size of array2: ");
		int m = scanner.nextInt();
		System.out.println("Enter " + m + " elements for array1: ");
		int[] a2 = new int[m];
		for(int i = 0; i < m; i++) {
			a2[i] = scanner.nextInt();
		}
		int l = n + m;
		int[] a3 = new int[l];
		mergearray.merge(a1, n, a2, m, a3);
		System.out.println("Mergerd Array: ");
		for(int i = 0; i < l; i++) {
			System.out.println(a3[i] + " ");
		}
	}
}

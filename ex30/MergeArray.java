package ex30;
import java.util.Scanner;
public class MergeArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array 1 size: "); // Array 1
		int size1 = sc.nextInt();
		int[] arr1 = new int[size1];
		System.out.println("Enter " +size1+ " elements: ");
		for(int i=0; i<size1; i++) {
			arr1[i]= sc.nextInt();
		}
		System.out.println("Enter array 2 size: "); // Array 2
		int size2 = sc.nextInt();
		int[] arr2 = new int[size2];
		System.out.println("Enter " +size2+ " elements: ");
		for(int i=0; i<size2; i++) {
			arr2[i]=sc.nextInt();
		}
		System.out.println("Merged array without duplicates:");
        mergeArrays(arr1, arr2);
		
	}
	  public static void mergeArrays(int[] arr1, int[] arr2) {
	        int i = 0, j = 0;

	        while (i < arr1.length && j < arr2.length) {
	            if (arr1[i] < arr2[j]) {
	                System.out.print(arr1[i] + " ");
	                i++;
	            } else if (arr1[i] > arr2[j]) {
	                System.out.print(arr2[j] + " ");
	                j++;
	            } else { // If both elements are equal, print once and move both pointers
	                System.out.print(arr1[i] + " ");
	                i++;
	                j++;
	            }
	        }

	        // Print remaining elements of arr1
	        while (i < arr1.length) {
	            System.out.print(arr1[i] + " ");
	            i++;
	        }

	        // Print remaining elements of arr2
	        while (j < arr2.length) {
	            System.out.print(arr2[j] + " ");
	            j++;
	        }
	    }

}

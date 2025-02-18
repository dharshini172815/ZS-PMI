package ex30;
import java.util.Scanner;
public class PrintDuplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter " +size+ " elements: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Duplicate elements in the array");
		findDuplicate(arr);
	}
	public static void findDuplicate(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && arr[i] != -1) {
                    System.out.print(arr[i] + " ");
                    arr[j] = -1; // Mark duplicate as processed
                }
            }
        }
	}

}

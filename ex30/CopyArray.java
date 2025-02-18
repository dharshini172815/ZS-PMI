package ex30;
import java.util.Scanner;
public class CopyArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter " +size+ " elements: ");
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		int index = 0;
		int[] result = new int[size];
		for(int i=0; i<size; i++) {
			result[index++] = arr[i];
		}
		System.out.println("Original array");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println("Copied array");
		for(int i=0; i<size; i++) {
			System.out.print(result[i]+ " ");
		}
	}
}

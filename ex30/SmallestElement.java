package ex30;
import java.util.Scanner;
public class SmallestElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter " +size+ " elements: " );
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		int min = 0;
		for(int i=0; i<size; i++) {
			for(int j=1; j<size; j++) {
				if(arr[i]<arr[j]) {
					min= arr[i];
				}
			}
		}
		System.out.println("Smallest element in array: " +min);

	}

}

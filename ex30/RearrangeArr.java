package ex30;
import java.util.Arrays;
import java.util.Scanner;
public class RearrangeArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter " +size+ " elements: ");
		for(int i=0; i<size; i++) {
			arr[i]= sc.nextInt();
		}
		Arrays.sort(arr);
		int[] result= new int[arr.length];
		int left = 0, right = arr.length - 1;
        int index = 0;
        
        while (left <= right) {
            if (index % 2 == 0) {
                result[index] = arr[right--]; // Take max element
            } else {
                result[index] = arr[left++]; // Take min element
            }
            index++;
        }
        System.out.println("Result array");
        for(int i=0; i<size; i++) {
        	System.out.print(result[i]+ " ");
        }
	}

}

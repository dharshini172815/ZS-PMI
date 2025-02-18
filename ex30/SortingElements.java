package ex30;
import java.util.Scanner;
import java.util.Arrays;
public class SortingElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter " +size+ " elements: ");
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		int[] odd = new int[(size+1)/2];
		int[] even = new int[size/2];
		int oddCount=0, evenCount=0;
		for(int i=0; i<size; i++) {
			if(i%2==0) {
				odd[oddCount++] = arr[i];
			}
			else {
				even[evenCount++] = arr[i];
			}
		}
		Arrays.sort(odd); // Ascending order
        Arrays.sort(even); // Ascending order
       
        // Reverse odd array to get descending order
        for (int i = 0; i < oddCount / 2; i++) {
            int temp = odd[i];
            odd[i] = odd[oddCount - 1 - i];
            odd[oddCount - 1 - i] = temp;
        }
        oddCount = 0;
        evenCount = 0;
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                arr[i] = odd[oddCount++];
            } else {
                arr[i] = even[evenCount++];
            }
        }
        
        System.out.println("Result array");
        for(int i=0; i<size; i++) {
        	System.out.print(arr[i]+ " ");
        }
	}

}

package ex30;
import java.util.Scanner;
public class SumofSeries {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms: ");
		int n = sc.nextInt();
		int sum =0;
		int term =0;
		System.out.print("Series: ");
	    for (int i = 1; i <= n; i++) {
	    	term = term * 10 + 1; // Generate next term (1, 11, 111, ...)
	        sum += term; // Add term to sum
	        System.out.print(term + (i < n ? " + " : "")); // Print series
	    }
        // Print the final sum
	    System.out.println("\nThe Sum is: " + sum);
	}
}

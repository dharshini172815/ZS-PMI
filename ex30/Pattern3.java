package ex30;
import java.util.Scanner;
public class Pattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int n = sc.nextInt();
	    for (int i = n; i >= 1; i--) { //row
	    	for (int j = 0; j < n - i; j++) { //space
	                System.out.print("  ");
	        }
	    	for (int j = 0; j < (2 * i - 1); j++) { // print *
	                System.out.print("* ");
	        }
	    	System.out.println(); // Move to the next line
	    }
	        
	}

}

package ex30;
import java.util.Scanner;
public class Pattern8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		 for (int i = 0; i < n; i++) {	//print top line
	            System.out.print("*");
	     }
	     System.out.println();
	     for (int i = 0; i < n - 2; i++) { // vertical line
	            System.out.println("*");
	     }
	     for (int i = 0; i < n; i++) { //bottom line
	           System.out.print("*");
	     }
	     System.out.println(); 
	}

}

package assignment_1;
import java.util.Scanner;
public class Swapping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Without using temporary variable
		//---------------------------------
		System.out.println("Enter value of A: ");
		int a = sc.nextInt();
		System.out.println("Enter value of B: ");
		int b = sc.nextInt();
    	System.out.println("Before swapping:  A = " +a+ ", B = " +b);
    	a = a+b;
    	b = a-b;
    	a = a - b;
    	System.out.println("After swapping:  A = " +a+ ", B = " +b);
		
//		Using Temporary variable
//	    -------------------------
//		System.out.println("Enter value of A: ");
//		int a = sc.nextInt();
//		System.out.println("Enter value of B: ");
//		int b = sc.nextInt();
//		System.out.println("Before swapping:  A = " +a+ ", B = " +b);
//		int temp =a;
//		a=b;
//		b=temp;
//		System.out.println("After swapping:  A = " +a+ ", B = " +b);		
	}

}

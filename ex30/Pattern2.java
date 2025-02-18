package ex30;
import java.util.Scanner;
public class Pattern2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int n = sc.nextInt();
		for(int i=n; i>=1; i--) {  //row
			for(int j=1; j<=i-1; j++) { //space
				System.out.print(" ");
			}
			for(int j=i; j<=n; j++) { // print number
				System.out.print(j+ "");
			}
			for(int j=n-1; j>=i; j--) { //print number in decending order
				System.out.print(j+ "");
			}
			System.out.println();
		}
	}

}

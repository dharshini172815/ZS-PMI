package ex30;
import java.util.Scanner;
public class Pattern1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {  //row
			for(int j=1; j<=n-i; j++) { //space
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++) { // print number
				System.out.print(j+ " ");
			}
			for(int j=i-1; j>=1; j--) { //print number in decending order
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}

}

package ex30;
import java.util.Scanner;
public class Pattern5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
        int count = 1;        
        for (int i = 1; count <= n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Print numbers
            for (int j = 0; j < i && count <= n; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
		}

}

package ex30;
import java.util.Scanner;
public class Pattern6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the odd length string: ");
		String n = sc.nextLine();
		int length = n.length();
		for(int i=0; i<length; i++) {
			for(int j=0; j<length; j++) {
				if(i==j || i+j == length-1) {
					System.out.print(n.charAt(j)+ " ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

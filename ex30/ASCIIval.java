package ex30;
import java.util.Scanner;
public class ASCIIval {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any character: ");
		char ch = sc.next().charAt(0);
		int ascii = (int)ch;
		System.out.println("ASCII value of " +ch+ " is: " +ascii);
	}

}

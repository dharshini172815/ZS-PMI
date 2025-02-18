package ex30;
import java.util.Scanner;
public class CheckAlphabet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);
		if(ch>='a' && ch<='z' || ch>'A' && ch<='Z') {
			System.out.println("Its a Alphabet");
		}
		else {
			System.out.println("Its a character");
		}
	}

}

package ex30;
import java.util.Scanner;
public class PrintLetters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character (A - Z): ");
		char input = sc.next().charAt(0);
		if(input<'A' || input >'Z') {
			System.out.println("Invalid input!! Enter a letter in uppercase (A - Z)");
		}
		else {
			for(char ch = input; ch<='Z'; ch++) {
				System.out.print(ch+ " ");
			}
		}
	}

}

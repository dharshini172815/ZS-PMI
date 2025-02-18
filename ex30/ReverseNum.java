package ex30;
import java.util.Scanner;
public class ReverseNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int reversed = 0;
		while(num!=0) {
			int rem = num%10;
			reversed = reversed*10+rem;
			num /=10;
		}
		System.out.println("Reversed number: " +reversed);
	}

}

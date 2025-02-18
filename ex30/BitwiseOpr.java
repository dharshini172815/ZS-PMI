package ex30;
import java.util.Scanner;
public class BitwiseOpr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first integer: ");
		int a = sc.nextInt();
		System.out.println("Enter second integer: ");
		int b = sc.nextInt();
		System.out.println("Bitwise AND (&): " + (a & b));
        System.out.println("Bitwise OR (|): " + (a | b));
        System.out.println("Bitwise XOR (^): " + (a ^ b));
        System.out.println("Bitwise Complement (~a): " + (~a));
        System.out.println("Left Shift (a << 1): " + (a << 1));
        System.out.println("Right Shift (a >> 1): " + (a >> 1));
        System.out.println("Unsigned right sfhit (a>>>1):" + (a>>>1));

	}

}

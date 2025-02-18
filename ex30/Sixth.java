package ex30;
import java.util.Scanner;
public class Sixth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a: ");
		int a = sc.nextInt();
		System.out.println("Enter value of b: ");
		int b = sc.nextInt();
		int res1 = ++a - b--;
		System.out.println("i) ++a - b- = " +res1);
		int res2 = a%b++;
		System.out.println("ii) a%b++ = " +res2);
		int res3 = a*=b+5;
		System.out.println("iii) a*=b+5 = " +res3);
		int res4 = 69>>>2;
		System.out.println("69 >>> 2 = " +res4);

	}

}

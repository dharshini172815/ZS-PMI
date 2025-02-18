package ex30;
import java.util.Scanner;
public class GroupingStudents {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int startingNum = 101;
		System.out.println("Total number of students: ");
		int n = sc.nextInt();
		int endingNum  = startingNum + (n-1);
		System.out.println("Group 1:");
		for(int i=startingNum; i<=endingNum; i+=4) {
			System.out.println(i);
		}
		System.out.println("Group 2:");
		for(int i=startingNum+1; i<=endingNum; i+=4) {
			System.out.println(i);
		}
		System.out.println("Group 3:");
		for(int i=startingNum+2; i<=endingNum; i+=4) {
			System.out.println(i);
		}
		System.out.println("Group 4:");
		for(int i=startingNum+3; i<=endingNum; i+=4) {
			System.out.println(i);
		}
		
	}

}

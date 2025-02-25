package assignment_1;
import java.util.Scanner;
public class FindAvgWeight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//program that calculates the average weight of 10 people
		float[] weight = new float[10];
		for(int i=0; i<weight.length;i++) {
			System.out.print("Enter weight of Person " +(i+1)+ ": ");
			weight[i] = sc.nextFloat();
		}
		float sum  = 0;
		for(float x:weight) {
			sum += x;
		}
		float avg = sum/weight.length;
		System.out.println("Average weight of 10 peoples : " +avg);

	}

}

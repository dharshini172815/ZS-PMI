package assignment_1;
import java.util.Scanner;
enum WeekdayName {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}
public class Weekday {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number for the weekday:   ");
        int dayNum= scanner.nextInt();

        if (dayNum >= 1 && dayNum <= 7) {
            WeekdayName day = WeekdayName.values()[dayNum - 1]; 
            System.out.println("Weekday is:   " + day);
        } else {
            System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }

        scanner.close();
	}

}

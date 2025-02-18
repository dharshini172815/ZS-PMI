package ex30;
import java.util.Scanner;
public class ExpandStr {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input: ");
        String input = scanner.nextLine();
        toExpand(input);
        scanner.close();
    }
	public static void toExpand(String str) {
        char currentChar = 0;
        int number = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                // If there's a previous character, print it before processing the new one
                if (currentChar != 0 && number > 0) {
                    printRepeated(currentChar, number);
                }
                currentChar = ch; // Store the new character
                number = 0; // Reset number
            }
            else if (Character.isDigit(ch)) {
                // Forming the number (handling multi-digit numbers)
                number = number * 10 + (ch - '0');
            }
        }
        // Print the last stored character sequence
        if (currentChar != 0 && number > 0) {
            printRepeated(currentChar, number);
        }
    }
    // Helper method to print character 'ch' repeated 'count' times
    public static void printRepeated(char ch, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(ch);
        }
    }
}

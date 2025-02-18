package ex30;
import java.util.Scanner;
public class ReverseStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = sc.nextLine();
		String[] words = sentence.split(" ");
		System.out.println("Reversed sentence: " +reversewords(words, words.length-1));
	}
	public static String reversewords(String[] words, int index) {
		 if (index == 0) {
			 return words[index]; 
	     }
	     return words[index] + " " + reversewords(words, index - 1);
	}
}

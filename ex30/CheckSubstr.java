package ex30;
import java.util.Scanner;
public class CheckSubstr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1: ");
		String s1 = sc.nextLine();
		System.out.println("Enter string 2: ");
		String s2 = sc.nextLine();
//		int index  = s1.indexOf(s2);    --> inbuilt method
//		System.out.println(index);
		int index = findIndex(s1, s2);
		System.out.println("Index: "+index);
	}
	public static int findIndex(String str1, String str2) {
		int n = str1.length();
		int m = str2.length();
		if(m>n) {
			return -1;
		}
		 // Loop through String1 to find a match for String2
        for (int i = 0; i <= n - m; i++) {
            int j;            
            // Check if substring from i matches String2
            for (j = 0; j < m; j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    break; // Mismatch found, stop checking this substring
                }
            }
            // If we completed inner loop, full match was found
            if (j == m) {
                return i; // Return starting index
            }
        }
        return -1; // No match found
	}

}

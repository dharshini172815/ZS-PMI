package assignment_1;
import java.util.Scanner;
public class TypeConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			// Widening
			System.out.println("Enter byte value: ");
			byte b = sc.nextByte();
	    	short s = b;     // byte → short
	    	int i = s;       // short → int
	    	long l = i;      // int → long
	    	float f = l;     // long → float
	        double d = f;    // float → double

	        System.out.println("Byte value: " + b);
	        System.out.println("Short value: " + s);
	        System.out.println("Integer value: " + i);
	        System.out.println("Long value: " + l);
	        System.out.println("Float value: " + f);
	        System.out.println("Double value: " + d);
	        
	        System.out.println();
	        
	        //Narrowing
	        System.out.println("Enter double value: ");
	        double d1= sc.nextDouble();
	        float f1 = (float) d1; // double → float
	        long l1 = (long) f1;   // float → long
	        int i1 = (int) l1;     // long → int
	        short s1 = (short) i1; // int → short
	        byte b1 = (byte) s1;   // short → byte

	        System.out.println("Double value: " + d1);
	        System.out.println("Float value: " + f1);
	        System.out.println("Long value: " + l1);
	        System.out.println("Integer value: " + i1);
	        System.out.println("Short value: " + s1);
	        System.out.println("Byte value: " + b1);
	}

}

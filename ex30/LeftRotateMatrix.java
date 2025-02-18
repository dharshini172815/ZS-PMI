package ex30;
import java.util.Scanner;
public class LeftRotateMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int row = sc.nextInt();
		System.out.println("Enter number of columns: ");
		int col = sc.nextInt();
		int[][] matrix = new int[row][col];
		System.out.println("Enter "+row+"+"+col+" elements: ");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("Original array");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(matrix[i][j]+ "\t");
			}
			System.out.println();
		}
		
		int rows = matrix.length;
	    if (rows == 0) return;
	    int cols = matrix[0].length;
	    for (int i = 0; i < rows; i++) {
            int firstElement = matrix[i][0]; // Store first element
            
            // Shift elements to the left
            for (int j = 0; j < cols - 1; j++) {
                matrix[i][j] = matrix[i][j + 1];
            }

            // Move first element to the last position
            matrix[i][cols - 1] = firstElement;
        }
	    
	    System.out.println("Result array");
	    for(int i=0; i<rows; i++) {
	    	for(int j=0; j<cols; j++) {
	    		System.out.print(matrix[i][j]+ "\t");
	    	}
	    	System.out.println();
	    }
	}

}

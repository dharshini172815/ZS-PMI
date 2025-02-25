package exercise30;

import java.util.Scanner;
public class Diagonal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the rows: ");
		int N=sc.nextInt();

		int[][] arr=new int[N][N];
		for(int i=0;i<N;i++){
		    for(int j=0;j<N;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		for (int d = 0; d < 2 * N - 1; d++) {
		    int col = d < N ? d : N - 1;
		    int row = d < N ? 0 : d - N + 1;

		   
		    while (col >= 0 && row < N) {
		        System.out.print("[ " +arr[row][col] + " ], ");
		        row++;
		        col--;
		    }
		    System.out.println(); 
		}

	}

}

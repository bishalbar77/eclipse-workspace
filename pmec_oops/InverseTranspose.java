package pmec_oops;

import java.util.Scanner;

public class InverseTranspose {
	static Scanner sc = new Scanner(System.in);
	static int n = sc.nextInt();

	public static void main(String args[]) {
			int array[][] = new int[n][n];
			int inverse[][] = new int[n][n];
			int adjoint[][] = new int[n][n];
			int transpose[][] = new int[n][n];
			System.out.println("Enter the elements of matrix:");
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					array[i][j] = sc.nextInt();
				}
			}
			System.out.println("The transpose of the matrix:");
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(array[j][i]+" ");
				}
				System.out.println();
			}
			adjoint(array, adjoint);
	}
	static void adjoint(int[][] array, int[][] adjoint) {
		int temp[][] = new int[n][n]; 
		System.out.println("The cofactor of the matrix:");
		for (int i = 0; i < n; i++) 
		{ 
			for (int j = 0; j < n; j++) 
			{ 
				cofactor(array, temp, i, j, n); 
				System.out.print(temp[j][i]+" ");
			} 
			System.out.println();
		}
		
	}
	static void cofactor(int A[][], int temp[][], int p, int q, int n) 
	{ 
		int i = 0, j = 0; 
		for (int row = 0; row < n; row++) 
		{ 
			for (int col = 0; col < n; col++) 
			{ 
				if (row != p && col != q) 
				{ 
					temp[i][j++] = A[row][col]; 
					if (j == n - 1) 
					{ 
						j = 0; 
						i++; 
					} 
				} 
			} 
		} 
	}
}

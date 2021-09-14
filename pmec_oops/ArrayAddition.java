package pmec_oops;
import java.util.Scanner;

public class ArrayAddition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter order of matrix (nxn): ");
		int n = sc.nextInt();
		int array1[][] = new int[n][n];
		int array2[][] = new int[n][n];
		int additionArray[][] = new int[n][n];
		System.out.println("Enter the elements of 1st array");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				array1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the elements of 2nd array");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				array2[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				additionArray[i][j] = array1[i][j] + array2[i][j];
			}
		}
		System.out.println("The sum of 2 array is");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(additionArray[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}

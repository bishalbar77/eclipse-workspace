package dsa.array;

import java.util.Scanner;

public class ArrayRotateOPT1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for(int i = 0; i < testCase; i++) {
			int arraySize = sc.nextInt();
			int rotate = sc.nextInt();
			int arr[] = new int[arraySize];
			int temp[] = new int[rotate];
			for(int j = 0; j < arraySize; j++) {
				arr[j] = sc.nextInt();
			}
			leftRotate(arr,rotate,arraySize);
			printArray(arr,arraySize);
		}
	}
	static void leftRotate(int arr[], int d, int n)
    {
        for (int i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }
 
    static void leftRotatebyOne(int arr[], int n)
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[n-1] = temp;
    }
 
    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

}

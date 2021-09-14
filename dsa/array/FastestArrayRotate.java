package dsa.array;

import java.util.Scanner;

public class FastestArrayRotate {

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
			leftRotate(arr,arraySize,rotate);
		}
	}
	
	static void leftRotate(int[] arr, int n, int d) {

        d = d % n;
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
    }
  
    /*Function to reverse arr[] from index start to end*/
    static void reverseArray(int arr[], int start, int end)
    {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}

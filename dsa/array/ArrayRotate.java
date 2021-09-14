package dsa.array;

import java.util.Scanner;

public class ArrayRotate {

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
			for(int j = 0; j < rotate; j++) {
				temp[j] = arr[j];
			}
			int count = rotate;
			while(count > 0) {
				for(int j = 0; j < arraySize-1; j++) {
					arr[j] = arr[j+1];
				}
				count--;
			}
			for(int j = (arraySize-rotate), k = 0; j < arraySize; j++, k++) {
				arr[j] = temp[k];
			}
			for(int j: arr) {
				System.out.println(j+" ");
			}
		}
	}

}

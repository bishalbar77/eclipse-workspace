package interview;
import java.util.Scanner;


public class GetMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arrayLength = sc.nextInt();
		int arr[] = new int[arrayLength];
		for(int i=0;i<arrayLength;i++) {
			arr[i] = sc.nextInt();
		}
		
		if(arrayLength % 2 == 0) {
			int findMid = arr[arrayLength/2 - 1];
			arr[arrayLength/2 - 1] = arr[arrayLength/2] + findMid;
			for(int i = arrayLength/2 + 2; i <arrayLength-1; i++) {
				arr[i] = arr[i+1];
			}
			arrayLength--;
		}
		for(int i=0;i<arrayLength;i++) {
			System.out.println(arr[i]);
		}
	}

}

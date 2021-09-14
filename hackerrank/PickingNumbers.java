package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class PickingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];
		int counter1=0, counter2=0;
		boolean isfound = false;
		for(int i=0;i<n;i++)
		{
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		for(int i=1;i<n;i++)
		{
			if(array[i-1] == (array[i]) || array[i-1] == (array[i]-1)) {
				int statement = isfound ? counter1++ : counter2++;
				System.out.println("hey");
			}
			else {
				if(isfound) {
					counter2=0;
				} else {
					counter1=0;
				}
				isfound = (isfound==true) ? false : true;
			}
		}
		int largest = (counter1>counter2) ? counter1:counter2;
		System.out.println(largest);
	}

}

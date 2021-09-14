package interview;

import java.util.Scanner;

public class FindNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int N = sc.nextInt();
		int X = sc.nextInt();
		int K = sc.nextInt();
		
		int[] arr = new int[X*X];
		String substr = null;
		String substr2 = null;
		for(int i=0;i<N/X;i++) {
			if(i!=0) {
				substr = str.substring(X, X+5);
				continue;
			}
			substr2 = str.substring(0, X);
		}
		int k=0;
		int returnValue = 0;
		for(int i=0;i<X;i++) {
			for(int j=0;j<X;j++) {
				arr[k] = substr.charAt(i) + substr2.charAt(j);
				k++;
				if(i==2) {
					returnValue = 9+(i*10);
					break;
				}
			}
		}
		System.out.println(returnValue);
	}

}

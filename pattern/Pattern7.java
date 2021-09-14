package pattern;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year : ");
		int year = sc.nextInt();
		if((year%4==0) || (year%100==0)) {
			for(int i=1;i<=9;i+=2) {
				for(int j=1;j<=i;j+=2) {
					System.out.print(j);
				}
				System.out.println();
			}
		} else {
			for(int i=8;i>=0;i-=2) {
				for(int j=8;j>=i;j-=2) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
	}

}

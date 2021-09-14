package hackerrank;

import java.util.Scanner;

public class TowerBreakers {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int noTestCases = sc.nextInt();
		for(int i=0;i<noTestCases;i++)
		{
			int testCase = sc.nextInt();
			int testCases[] = new int[testCase];
			int currPlayer = 2;
			boolean isVisited = true;
			for(int j=0;j<testCase;j++) {
				testCases[j] = sc.nextInt(); 
			}
			for(int k=0;k<testCase;k++) {
				if(testCases[k] > 1) {
					--testCases[k];
					currPlayer = (currPlayer == 1) ? 2 : 1;
					isVisited = false;
				}
			}
			System.out.println(currPlayer);
		}
	}
	
}

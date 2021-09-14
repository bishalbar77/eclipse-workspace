package pmec_oops;

import java.util.*;

public class SumMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int sum=0, multi=1;
		for(int i=1;i<=m;i++) // m=4
			sum = sum + i;  // sum = 1 + 2 + 3 + 4;
		for(int i=1;i<=n;i++)
			multi = multi * i;
		System.out.println("Sum = "+sum);
		System.out.println("Multiple = "+multi);
	}

}

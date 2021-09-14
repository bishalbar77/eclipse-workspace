package codechef.dsa;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			while(sc.hasNextInt())  
	        { 
				int s = sc.nextInt();
				int num=0;
				while(s!=0)
				{
					num = (num*10) + (s%10);
					s=s/10;
				}
				System.out.println(num);
	        }
		}
	}

}

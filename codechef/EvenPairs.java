package codechef;

import java.util.Scanner;

public class EvenPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num1 = 0, num2 = 0;
		for(int i=0;i<n;i++) 
		{
			String s[]= sc.nextLine().split(" ");
			for(int i1 =0 ;i1 < s.length;i1++)
			{
			    num1= Integer.parseInt(s[i1]);
			    num2= Integer.parseInt(s[i1+1]);
			}
			if(num1==1 && num2==1)
			{
				System.out.println("1");
			}
			while(num1>1 && num2>1)
			{
				
				for(int j=num1;j>0;j--)
				{
					System.out.println(j+" "+num2);
				}
				for(int j=num2-1;num2>0;j--)
				{
					System.out.println(num1+" "+j);
				}
			}
			
		}

	}

}

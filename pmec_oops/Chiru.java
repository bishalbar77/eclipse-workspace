package pmec_oops;

import java.util.*;

public class Chiru {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		int lb,ub;
		System.out.println("input lowerbound and upper bound ::");
		lb=p.nextInt();
		ub=p.nextInt();
        System.out.print("Armstrong numbers from"+lb+"to"+ub+"is::\n");
        for(int i = lb; i <= ub; i++)
        {
    		double n, l = 0, b=0,v;
    		double sum = 0;
            n = i;
            for(v=i,l=0;v>0;v=v/10,l++);
            while(n > 0)
            {
                b = n % 10;
                sum = sum +Math.pow(b,l);
                n = n / 10;
            }
            System.out.println(b);
            System.out.println(sum);
            System.out.println(n);
            if(sum == i)
            {
                System.out.print(i+" , ");
            }
            sum = 0;
        }

		
	}

}

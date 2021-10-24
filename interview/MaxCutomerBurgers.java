package interview;

import java.util.Scanner;

public class MaxCutomerBurgers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int towns[] = new int[n+1];
        int burgers[] = new int[n];
        for(int i= 0; i <= n; i++) {
        	towns[i] = sc.nextInt();
        }
        for(int i= 0; i <n; i++) {
        	burgers[i] = sc.nextInt();
        }
        int eatenBurgers = maxBurgers(burgers, n);
        for(int i= 0; i <= n; i++) {
        	towns[i] += eatenBurgers%2;
        }
        if(n > 2) {
        	System.out.println((n*3) + 1);
        } else {
        	System.out.println(n+1);
        }
	}
	
	static int maxBurgers(int hval[], int n)
    {
        if (n == 0)
        return 0;
  
        int value1 = hval[0];
        if (n == 1)
            return value1;
  
        int value2 = Math.max(hval[0], hval[1]);
        if (n == 2)
            return value2;
        int max_val = 0;
        for (int i=2; i<n; i++)
        {
            max_val = Math.max(hval[i]+value1, value2);
            value1 = value2;
            value2 = max_val;
        }
  
        return max_val;
    }

}

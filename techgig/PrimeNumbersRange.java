package techgig;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class PrimeNumbersRange {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int lowerRange = sc.nextInt();
			int upperRange = sc.nextInt();
			System.out.println(segmentedSieve(lowerRange, upperRange));
		}
	}
	static int segmentedSieve(int low, int high)
    {
        if(low < 2)
          low = 2;
      //Neglecting 0 or 1 value of low
           
          Vector<Integer> prime = new Vector<Integer>();
        simpleSieve(high, prime); // stores primes upto
                                  // sqrt(high) in prime
         
        boolean[] mark = new boolean[high - low + 1];
        for (int i = 0; i < mark.length; i++)
            mark[i] = true;
 
        for (int i = 0; i < prime.size(); i++) {
            // find minimum number in [low...high]
            // that is multiple of prime[i]
            int loLim = (low / prime.get(i)) * prime.get(i);
            // loLim += prime.get(i);
            if (loLim < low)
                loLim += prime.get(i);
            if (loLim == prime.get(i))
                loLim += prime.get(i);
 
            for (int j = loLim; j <= high;
                 j += prime.get(i)) {
                 mark[j - low] = false;
            }
        }
        int lowerPrime = -1;
        int upperPrime = -1;
 
        // print all primes in [low...high]
        for (int i = low; i <= high; i++) {
            if (mark[i - low] == true) {
	        	if(lowerPrime == -1) {
	        		lowerPrime = i;
	        	}
	        	upperPrime = i;
            }
        }
        return (lowerPrime == -1) ? lowerPrime :(upperPrime - lowerPrime);
    }
	
	static void simpleSieve(int limit,
            Vector<Integer> prime)
	{
		// bound is square root of "high"
		int bound = (int)Math.sqrt(limit);
		
		boolean[] mark = new boolean[bound + 1];
		for (int i = 0; i <= bound; i++)
		mark[i] = true;
		
		for (int i = 2; i * i <= bound; i++) {
			if (mark[i] == true) {
			for (int j = i * i; j <= bound; j += i)
			    mark[j] = false;
			}
		}
		
		// adding primes to vector
		for (int i = 2; i <= bound; i++) {
			if (mark[i] == true)
			prime.add(i);
		}
	}

}

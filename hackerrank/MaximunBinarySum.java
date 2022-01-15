package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximunBinarySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> str = new ArrayList<String>();
		str.add("11");
		str.add("01");
		System.out.println(maximumBinary(2, 1, str));
	}
	
	public static int maximumBinary(int numberOfBits, int maximumOperationsAllowed, List<String> arr) {
        int[] newArray = new int[arr.size()];
        int minIndex = arr.indexOf(Collections.min(arr));
		for (int j = 0; j < numberOfBits; j++)
	    {
			while(maximumOperationsAllowed > 0) {
				int compliment = onesComplement(Integer.parseInt(arr.get(minIndex)));
				maximumOperationsAllowed--;
				if(Integer.parseInt(arr.get(minIndex)) < compliment) {
					String maxBinaryFlip = Integer.toString(compliment);
					arr.set(minIndex, maxBinaryFlip);
					break;
				}
			}
	    }
		for(int i = 0; i < arr.size(); i++) {
			newArray[i] = Integer.parseInt(arr.get(i));
		}
		int maxSum[] = new int[numberOfBits+2];
		for(int i = 0; i < arr.size(); i++) {
			int[] newGuess = new int[arr.get(i).length()];
			for (int j = 0; j < arr.get(i).length(); j++)
			{
			    newGuess[j] = arr.get(i).charAt(j) - '0';
			}
			maxSum = addNumbers(newGuess, maxSum);
		}
		for(int i: maxSum) {
			System.out.println(i);
		}
		return 0;
    }
	
	public static int[] addNumbers(int[] firstNum, int[] secondNum) {
        int[] result = new int[firstNum.length + 1];
        int digitSum, carry = 0, i;
        for (i = firstNum.length - 1; i >= 0; i--) {
            digitSum = firstNum[i] + secondNum[i] + carry;
            result[i + 1] = digitSum % 2;
            carry = digitSum / 2;
        }
        result[0] = carry;
        return result;
    }
	
	static int onesComplement(int n)
    {
         
        // Find number of bits in the
        // given integer
        int number_of_bits =
               (int)(Math.floor(Math.log(n) /
                             Math.log(2))) + 1;
 
        // XOR the given integer with poe(2,
        // number_of_bits-1 and print the result
        return ((1 << number_of_bits) - 1) ^ n;
    }

}

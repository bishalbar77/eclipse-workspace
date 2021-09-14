package hackerrank;

public class CharValue {

	public static void main(String args[]) {
		String P = "giraffe", Q = "01111001111111111011111111";
		   
	    int K = 2;
	   
	    int N = P.length();
	   
	    System.out.print(getSpecialSubstring(P.toCharArray(), Q.toCharArray(), K, N));
	}
	public static int getSpecialSubstring(String s, int k, String charValue) {

	    int N = s.length();
		char[] P = s.toCharArray();
		char[] Q = charValue.toCharArray();
	    if (k == 0)
	        return 0;
	    int count = 0;
	    int left = 0, right = 0;
	    int ans = 0;
	   
	    while (right < N) {
	   
	        while (right < N && count <= k) {
	            int pos = P[right] - 'a';
	            if (Q[pos] == '0') {
	                if (count + 1 > k)
	   
	                    break;
	   
	                else
	                    count++;
	            }
	   
	            right++;
	            if (count <= k)
	                ans = Math.max(ans, right - left);
	        }
	   
	        while (left < right) {
	            int pos = P[left] - 'a';
	   
	            left++;
	            if (Q[pos] == '0')
	   
	                count--;
	   
	            if (count < k)
	                break;
	        }
	    }
	   
	    return ans;
	}
	   
}

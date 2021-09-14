package interview;

import java.util.*;

public class BufferCheck {

		
		public static boolean isSubsequence(String s, String t) {
	        List<Integer>[] idx = new List[256]; // Just for clarity
	        for (int i = 0; i < t.length(); i++) {
	            if (idx[t.charAt(i)] == null)
	                idx[t.charAt(i)] = new ArrayList<>();
	            idx[t.charAt(i)].add(i);
	        }
	        
	        int prev = 0;
	        for (int i = 0; i < s.length(); i++) {
	            if (idx[s.charAt(i)] == null) return false; // Note: char of S does NOT exist in T causing NPE
	            int j = Collections.binarySearch(idx[s.charAt(i)], prev);
	            if (j < 0) j = -j - 1;
	            if (j == idx[s.charAt(i)].size()) return false;
	            prev = idx[s.charAt(i)].get(j) + 1;
	        }
	        return true;
	    }

		// Driver program
		public static void main(String[] args)
		{
			String str1 = "geko";
			String str2 = "geeksforgeeks";
			int m = str1.length();
			int n = str2.length();
			boolean res = isSubsequence(str1, str2);
			if (res)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}


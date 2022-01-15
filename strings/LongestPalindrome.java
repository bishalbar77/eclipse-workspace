package strings;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abccccdd";
		System.out.println(longestPalindrome(s));
	}
	
	public int longestPalindrome(String s) {
		if(s == null || s.length() == 0) return 0;
		int count = 0;
		Set<Character> chars = new HashSet<>();
		for(char i = 0; i < s.length(); i++) {
			if(chars.contains(s.charAt(i))) {
				chars.remove(s.charAt(i));
				count++;
			} else {
				chars.add(s.charAt(i));
			}
		}
		if(!chars.isEmpty()) {
			return 1 + count * 2;
		}
		return count * 2;
        
    }

}

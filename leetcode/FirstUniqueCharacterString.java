package leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabb";
		System.out.println(firstUniqChar(s));
	}
	
	public static int firstUniqChar(String s) {
		Map<Character, Integer> occurences = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
        	occurences.put(s.charAt(i), occurences.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i = 0; i < s.length(); i++) {
        	if(occurences.get(s.charAt(i)) == 1) {
        		return i;
        	}
        }
		return -1;
        
    }
}

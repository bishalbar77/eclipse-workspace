package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortCharactersByFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Aabb";
        TreeMap<Character, Integer> sortedMap = new TreeMap<>();
        for(int i = 0; i < s.length(); i++) {
        	sortedMap.put(s.charAt(i), s.charAt(i));
        }
        StringBuffer str = new StringBuffer();
        for (Map.Entry map : sortedMap.entrySet()) {
            char key = (char) map.getKey();
            int value = (int) map.getValue();
            System.out.println((int)key+ " : "+value);
        }
	}

	public static String frequencySort(String s) {
		return s;
    }

}

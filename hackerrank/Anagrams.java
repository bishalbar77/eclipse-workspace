package hackerrank;

import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() == b.length()) {
            boolean flag = true;
            int count_a=0, count_b=0;
            for(int i=0;i<a.length();i++) {
                for(int j=0;j<a.length();j++) {
                    if(a.charAt(j) == a.charAt(i)) {
                        count_a++;
                    }
                    if(b.charAt(j) == a.charAt(i) || Character.toUpperCase(b.charAt(j)) == a.charAt(i) || Character.toLowerCase(b.charAt(j)) == a.charAt(i)) {
                        count_b++;
                    }
                }
                if(count_a != count_b) {
                    return false;
                }
            }
            return flag;
        } else {
            return false;
        }
    }

  public static void main(String[] args) {

package geeksforgeeks;
import java.util.HashSet;
import java.util.Set;
class DistinctProblems {


    public static int distinctPasswords(int input1, String input2[]) {
	        int count = 0; 
	        Set<String> set = new HashSet<>();
	        for (int i = 0; i < input1; i++) {
	            if (!set.contains(encodeString(input2[i].toCharArray()))) {
	            	set.add(encodeString(input2[i].toCharArray()));
	                count++;
	            }
	        }
	        return count;
    }
    
   	public static String encodeString(char[] str) {
   			int MAX_CHAR = 26;
           int hashEven[] = new int[MAX_CHAR];
           int hashOdd[] = new int[MAX_CHAR];
           for (int i = 0; i < str.length; i++) {
               char c = str[i];
               if ((i & 1) != 0) // If index of current character is odd
                   hashOdd[c-'a']++;
               else
                   hashEven[c-'a']++;
    
           }
           String encoding = "";
           for (int i = 0; i < MAX_CHAR; i++) {
               encoding += (hashEven[i]);
               encoding += ('-');
               encoding += (hashOdd[i]);
               encoding += ('-');
           }
           return encoding;
    }
 
    public static void main(String[] args) {
        String input[] = {"abcd", "cdab"};
        int n = input.length;
 
        System.out.println(distinctPasswords(n, input));
    }
}

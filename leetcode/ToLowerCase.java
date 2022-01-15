package leetcode;

public class ToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		System.out.println(toLowerCase(s));
	}
    public static String toLowerCase(String s) {
    	StringBuffer lowerCaseString = new StringBuffer(s);
		for(int i = 0; i < s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				lowerCaseString.setCharAt(i, Character.toUpperCase(s.charAt(i)));
			}
		}
		return lowerCaseString.toString();
        
    }

}

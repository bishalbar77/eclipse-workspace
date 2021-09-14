package leetcode;

import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(decodeString("3[a]2[bc]"));
	}
	
    public static String decodeString(String T) {
        if (T.length() == 0 || T == null) {
            return T;
        }
        Stack<String> rawString = new Stack<String>();
        Stack<Integer> numStack = new Stack<Integer>();
        StringBuilder res = new StringBuilder();
        int count = 0;
        while (count < T.length()) {
            if (Character.isDigit(T.charAt(count))) {
                int num = 0;
                while (Character.isDigit(T.charAt(count))) {
                    num = num * 10 + (T.charAt(count) - '0');
                    count++;
                }
                numStack.push(num);
            } else if (T.charAt(count) == '[') {
                rawString.push(res.toString());
                res = new StringBuilder("");
                count++;
            } else if (T.charAt(count) == ']') {
                StringBuilder temp = new
                              StringBuilder(rawString.pop());
                int repeatTimes = numStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(res);
                }
                res = temp;
                count++;
            } else {
                res.append(T.charAt(count++));
            }
        }
        return res.toString();
    }


}

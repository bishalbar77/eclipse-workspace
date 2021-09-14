package leetcode;

import java.util.*;

public class TextEditor {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		String s = "";
		Stack<String> st =new Stack<String>();
		st.push(s);
		for(int i=0;i<n;i++){
			int t=scn.nextInt();
			if(t==1){ 
				s = s+scn.next();
				st.push(s);
			}
			else if(t==2){
				s=s.substring(0,s.length()-scn.nextInt());
				st.push(s);
			}
			else if(t==3){
				System.out.println(s.charAt(scn.nextInt()-1));
			}
			else{
				st.pop();
				s=st.peek();
			}
		}
	}
}
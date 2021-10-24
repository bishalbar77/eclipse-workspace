package interview;
import java.util.*;

public class FlipBalancedBrackets {
	
		public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        sc.nextLine();
	        String binary = sc.nextLine();
	        String expression = sc.nextLine();
	        boolean flag = false;
	        for(int i = 0; i < n; i++) {
	        	if(binary.charAt(i) == '1') {
	        		if(expression.charAt(i) == '(') {
	        			expression = expression.substring(0, i) + ')'
	        		              + expression.substring(i + 1);
	        		} else {
	        			expression = expression.substring(0, i) + '('
	        		              + expression.substring(i + 1);
	        		}
	        	}
		        if (areBracketsBalanced(expression))
		        	flag = true;
	        }
	        if (flag)
	            System.out.println("YES");
	        else
	            System.out.println("NO");
	    }
		
	    static boolean areBracketsBalanced(String expr)
	    {
	        Deque<Character> stack
	            = new ArrayDeque<Character>();
	        for (int i = 0; i < expr.length(); i++)
	        {
	            char x = expr.charAt(i);
	 
	            if (x == '(')
	            {
	                stack.push(x);
	                continue;
	            }
	            if (stack.isEmpty())
	                return false;
	            char check;
	            switch (x) {
	            case ')':
	                check = stack.pop();
	                if (check == '{' || check == '[')
	                    return false;
	                break;
	            }
	        }
	        return (stack.isEmpty());
	    }
	 
	    // Driver code
	    
	}

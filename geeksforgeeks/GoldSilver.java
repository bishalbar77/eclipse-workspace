package geeksforgeeks;

public class GoldSilver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "10010100";
		int N = 8;
		System.out.println(flipCoins(N,s));
	}
	
	public static String flipCoins(int N,String s) {
        // Code here
        int count = 2;
        for(int i=0;i<N;i++) {
        	if(count == 0)
        		break;
            if(s.charAt(i) == '1')
                continue;
            else {
                for(int j=i;j<N;j++,i++){
                    if(s.charAt(j) == '0') {
                    	if(j == N-1)
                    		s = s.substring(0,j)+'1';
                    	else
                    		s = s.substring(0,j)+'1'+s.substring(j+1);
                    } else {
                    	count--;
                    	break;
                    }
                }
            }
        }
		return s;
    }

}

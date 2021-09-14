package leetcode;

public class JewelsAndStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i = 0; i < jewels.length(); i++) {
            for(int j = 0; j < stones; j++) {
                if(jewels.charAt(i) == stones.charAt(j))
                    count++;
            }
        }
        return count;
    }

}

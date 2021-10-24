package bitmanipulation;

public class FindPositionOfOnlySetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static int findPosition(int N) {
        int count = 0;
        int position = 0;
        while(N > 0) {
            count += N & 1;
            N>>=1;
            position++;
        }
        if(count == 1) {
            return position;
        } else {
            return -1;
        }
    }

}

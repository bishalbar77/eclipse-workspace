package leetcode;

public class SqrtOfX {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mySqrt(156));
	}
	public int mySqrt(int x) {
        int left = 0, right = Integer.MAX_VALUE;
        return binarySearch(left, right, x);
    }
	
	static int binarySearch(int low, int high, int target) {
		if(high >= low) {
			if(low*low == target) return low;
			if(high*high == target) return high;
			int mid = low + (high-low)/2;
			if(mid == target) return mid;
			if(mid < target) {
				return binarySearch(mid+1, high, target);
			} else if(mid > target) {
				return binarySearch(low, mid-1, target);
			}
		}
		return -1;
	}

}

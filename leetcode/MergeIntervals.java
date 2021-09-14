package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals = {{2,6},{1,3},{8,10},{15,18}};
		int[][] mergedIntervals = merge(intervals);
		for(int[] i: mergedIntervals) {
			for(int j: i) {
				System.out.println(j);
			}
		}
	}
	public static int[][] merge(int[][] intervals) {
	    List<int[]> res = new ArrayList<>();
	    if(intervals.length == 0 || intervals == null) {
	    	return res.toArray(new int[0][]);
	    }
	    
	    // If not sorted
		Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
		
		int start = intervals[0][0];
		int end = intervals[0][1];
		for(int[] row: intervals) {
			if(row[0] <= end) {
				end = Math.max(row[1], end);
			} else {
				res.add(new int[] {start,end});
				start = row[0];
				end = row[1];
			}
		}
		res.add(new int[] {start,end});
    	return res.toArray(new int[0][]);
	}

}

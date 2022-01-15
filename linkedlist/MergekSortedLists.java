package linkedlist;

public class MergekSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public ListNode mergeKLists(ListNode[] lists) {
        return partition(lists, 0, lists.length - 1);
    }
	
	private ListNode partition(ListNode[] lists, int start, int end) {
		if(start == end) return lists[start];
		if(start < end) {
			int mid = (start + end)/2;
			ListNode l1 = partition(lists, start, mid);
			ListNode l2 = partition(lists, mid+1, end);
			return mergeTwoLists(l1,l2);
		} else {
			return null;
		}
		
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.val > l2.val) {
			ListNode temp = l1;
			l1 = l2;
			l2 = temp;
		}
		
		ListNode resultant = l1;

		while(l1 != null && l2 != null) {
		    ListNode temp = null;
			while(l1 != null && l1.val <= l2.val) {
				temp = l1;
				l1 = l1.next;
			}
			temp.next = l2;
			ListNode tmp = l1;
            l1 = l2;
            l2 = tmp;
		}
		
		return resultant;
        
    }

}

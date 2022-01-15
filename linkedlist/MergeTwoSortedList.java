package linkedlist;

public class MergeTwoSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode listOne1 =  new ListNode(1);
		ListNode listOne2 =  new ListNode(2);
		ListNode listOne3 =  new ListNode(4);
		listOne1.next = listOne2;
		listOne2.next = listOne3;
		ListNode listTwo1 =  new ListNode(1);
		ListNode listTwo2 =  new ListNode(3);
		ListNode listTwo3 =  new ListNode(4);
		listTwo1.next = listTwo2;
		listTwo3.next = listTwo3;
		
		ListNode mergedList = mergeTwoLists(listOne1, listTwo1);
		ListNode currNode = mergedList;
		while(currNode != null) {
			System.out.println(currNode.val);
			currNode = currNode.next;
		}
	}
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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

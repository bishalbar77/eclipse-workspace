package linkedlist;

public class LinkedListCycleII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);  
		ListNode second = new ListNode(2);  
		ListNode third = new ListNode(3);  
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);  
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = third;
		System.out.println(detectCycle(head).val);
	}
	
	public static ListNode detectCycle(ListNode head) {
		if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode entry = head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast == slow) {
            	while(entry != slow) {
                    slow=slow.next;
                    entry=entry.next;
            	}
            	return entry;
            }
        }
        return null;
    }

}

package linkedlist;

public class ReverseLinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);  
		ListNode second = new ListNode(2);  
		ListNode third = new ListNode(3);  
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);  
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = null;
		ListNode reverseHead = reverseList(head);
		while(reverseHead != null) {
			System.out.println(reverseHead.val);
			reverseHead = reverseHead.next;
		}
	}
	
	public static ListNode reverseList(ListNode head) {
		ListNode prev = new ListNode();  
		ListNode curr = new ListNode();  
		prev = null;
		curr = head;
		while(curr != null) {
			ListNode temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp; 
		}
		return prev;
        
    }

}

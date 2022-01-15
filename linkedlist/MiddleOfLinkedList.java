package linkedlist;

public class MiddleOfLinkedList {

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
		ListNode middle = middleNode(head);
		System.out.println(middle.val);
	}
	
	public static ListNode middleNode(ListNode head) {
		ListNode fast = new ListNode();  
		ListNode slow = new ListNode(); 
		fast = head;
		slow = head;
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		
		return slow;
	        
	}

}

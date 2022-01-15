package linkedlist;

public class PalindromeLinkedList {

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
		fifth.next = null;
		System.out.println(isPalindrome(head));
	}

	public static boolean isPalindrome(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		
		// Find the middle element using tortoise method
		while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
		
		// Reverse the 2nd half linked list
		slow.next = reverseList(slow.next);
		
		// Move slow by 1
		slow = slow.next;
		
		// Check if 1st half of the linked list is equal to 2nd half
		while(slow != null) {
			if(head.val != slow.val)
				return false;
			head = head.next;
			slow = slow.next;
		}
		return true;
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

package linkedlist;

public class RotateList {

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
		ListNode reverseHead = rotateRight(head, 2);
		while(reverseHead != null) {
			System.out.println(reverseHead.val);
			reverseHead = reverseHead.next;
		}
	}
	
	public static ListNode rotateRight(ListNode head, int k) {
		if (head == null || head.next == null|| k == 0) return head;
		ListNode curr = head;
		int length = 1;
		while(curr.next != null) {
			curr = curr.next;
			length++;
		}
		curr.next = head;
		k = length - (k % length);
		while(k-- > 0) {
			curr = curr.next;
		}
		head = curr.next;
		curr.next = null;
		return head;
        
    }

}

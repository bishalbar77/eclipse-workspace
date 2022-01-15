package linkedlist;

public class ReverseNodeskGroup {

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
		System.out.println(reverseKGroup(head, 2).val);
	}
	
	public static ListNode reverseKGroup(ListNode head, int k) {
        int count = 0;
        ListNode curr = head;
        while(curr != null && count != k) {
        	curr = curr.next;
        	count++;
        }
        if(count == k) {
            curr = reverseKGroup(curr, k);
            while(count-- > 0) {
            	ListNode temp = head.next;
            	head.next = curr;
            	curr = head;
            	head = temp;
            }
            head = curr;
        }
		return head;
    }

}

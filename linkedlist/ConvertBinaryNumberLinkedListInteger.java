package linkedlist;

public class ConvertBinaryNumberLinkedListInteger {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);  
		ListNode second = new ListNode(0);  
		ListNode third = new ListNode(1);  
		ListNode fourth = new ListNode(1);
		ListNode fifth = new ListNode(0);  
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = null;
		System.out.println(getDecimalValue(head));
	}
	
	public static int getDecimalValue(ListNode head) {
		ListNode currentNode = head;
		String binaryNumber = "";
		while(currentNode != null) {
			binaryNumber = binaryNumber + currentNode.val;
			currentNode = currentNode.next;
		}
		return Integer.parseInt(binaryNumber,2);
        
    }

}

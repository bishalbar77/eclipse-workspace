package linkedlist;

public class IntersectionTwoLinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode listOne1 =  new ListNode(1);
		ListNode listOne2 =  new ListNode(2);
		ListNode listTwo1 =  new ListNode(1);
		ListNode listTwo2 =  new ListNode(3);
		ListNode listTwo3 =  new ListNode(4);
		ListNode listTwo4 =  new ListNode(8);
		ListNode listTwo5 =  new ListNode(5);
		listOne1.next = listOne2;
		listOne2.next = listTwo3;
		listTwo1.next = listTwo2;
		listTwo3.next = listTwo3;
		listTwo3.next = listTwo4;
		listTwo4.next = listTwo5;
		
		System.out.println(getIntersectionNode(listOne1, listTwo1));
	}
	
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA == null || headB == null) return null;
		ListNode a = headA;
		ListNode b = headB;
		
		while(a != b) {
			a = (a!=null) ? a.next : headB;
			b = (b!=null) ? b.next : headA;
		}
		return a; 
    }

}

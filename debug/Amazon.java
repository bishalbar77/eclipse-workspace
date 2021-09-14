package debug;
import java.util.*; 

class Node  
{ 
	 int data; 
	 Node next; 
	 Node(int d) {data = d; 
	              next = null;} 
} 
class Amazon  
{ 
	int arrowCount=0;
	Node head;  
	public void addToTheLast(Node node)  
	{ 
		 if (head == null) 
		 { 
		     head = node; 
		 } 
		 else 
		 { 
		     Node temp = head; 
		     while (temp.next != null) 
		         temp = temp.next; 
		     temp.next = node; 
		 } 
	} 

	void print() 
	{ 
		
		 Node temp = head; 
		 while (temp != null) 
		 { 
			 if(arrowCount>0)
			     System.out.print("->"); 
		     System.out.print(temp.data); 
		     temp = temp.next; 
		     arrowCount++;
		 }  
		 System.out.println(); 
	} 

	public static void main(String args[]) 
	{ 

	 Scanner sc = new Scanner (System.in);
	 Amazon list1 = new Amazon(); 
	 Amazon list2 = new Amazon(); 
	   
	 // head1
	 System.out.println("head1");
	 list1.addToTheLast(new Node(sc.nextInt())); 
	 list1.addToTheLast(new Node(sc.nextInt())); 
	 list1.addToTheLast(new Node(sc.nextInt())); 
	 list1.addToTheLast(new Node(sc.nextInt())); 
	  // head2
	 System.out.println("head2");
	 list2.addToTheLast(new Node(sc.nextInt())); 
	 list2.addToTheLast(new Node(sc.nextInt())); 
	 list2.addToTheLast(new Node(sc.nextInt())); 
	 list2.addToTheLast(new Node(sc.nextInt())); 
	  
	 list1.head = new SortingClass().sortedMerge(list1.head,  
	                                     list2.head); 
	 list1.print();      
	   
	} 
} 

class SortingClass 
{ 
	Node sortedMerge(Node headA, Node headB) 
	{ 
   
		 Node nextNode = new Node(0); 
		 Node tail = nextNode; 
		 while(true)  
		 { 
		     if(headA == null) 
		     { 
		         tail.next = headB; 
		         break; 
		     } 
		     if(headB == null) 
		     { 
		         tail.next = headA; 
		         break; 
		     }  
		     if(headA.data <= headB.data) 
		     { 
		         tail.next = headA; 
		         headA = headA.next; 
		     }  
		     else
		     { 
		         tail.next = headB; 
		         headB = headB.next; 
		     } 
		     tail = tail.next; 
		 } 
		 return nextNode.next; 
	} 
} 
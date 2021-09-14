package vectorAndStacks;
//Stack extends VECTORS implements LISTS extends COLLECTIONS


public class MainClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MyOwnStack<Integer> stack = new MyOwnStack<>();
		stack.push(45);
		
	
		
		System.out.println(stack.pop());           //returns the pop/deleted element
		System.out.println(stack.peek());          // shows the head or last inputted element  
		
		final String a ="bishal";
		

	}

}

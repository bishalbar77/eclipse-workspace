package collections.list;

import java.util.Stack;

public class LearnStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> animals = new Stack<>();
		animals.push("Lion");
		animals.push("Deer");
		animals.push("Horse");
		animals.push("Pig");
		System.out.println(animals.pop());
		System.out.println(animals);
		System.out.println(animals.peek());
		
	}

}

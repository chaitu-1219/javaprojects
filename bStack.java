package first;

import java.util.*;

public class bStack {

	public static void main(String[] args) {
		Stack<String> BStack=new Stack<String>();
		BStack.push("Burger 1");
		BStack.push("Burger 2");
		BStack.push("Burger 3");
		System.out.println("Top burger is :"+BStack.peek());
		System.out.println("Serving :"+BStack.pop());
		BStack.pop(); 
		BStack.pop();
		if(BStack.isEmpty()) {
			System.out.println("empty");
		}

	}

}

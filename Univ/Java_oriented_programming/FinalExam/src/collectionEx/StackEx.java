package collectionEx;

import java.util.*;

public class StackEx {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("item1");
		stack.push("item2");
		stack.push("item3");
		stack.push("item4");
		stack.push("item5");
		
		while(!stack.isEmpty()) {
			String item = stack.pop();
			System.out.println(item);
		}
	}

}

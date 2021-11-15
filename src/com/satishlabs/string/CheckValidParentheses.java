package com.satishlabs.string;

import java.util.Stack;

public class CheckValidParentheses {
	public static void main(String[] args) {
		String str ="([{}])";
		if(isValidParentheses(str)) {
			System.out.println("Valid");
		}else {
			System.out.println("Not Valid");
		}
	}

	private static boolean isValidParentheses(String str) {
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<str.length(); i++) {
			char x = str.charAt(i);
			if(x =='(' || x == '{' || x == '[') {
				// Push the element in the stack 
				stack.push(x);
				continue;
			}
			// IF current current character is not opening 
            // bracket, then it must be closing. So stack 
            // cannot be empty at this point. 

			if(stack.isEmpty())
				return false;
			switch (x) {
			case ')': stack.pop();
						if(x == '}' || x ==']')
						    break;
			case '}' : stack.pop();
						if(x == ')' || x == ']')
							break;		
			case ']': stack.pop();
						if(x ==')' || x=='}')
							break;
			}
		}
		return (stack.isEmpty());
	}

}

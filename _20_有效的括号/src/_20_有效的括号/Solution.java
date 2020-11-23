package _20_有效的括号;

import java.util.Stack;

public class Solution {
	public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '[' || c == '{' || c == '(') {//左括号
				stack.push(c);
			}else {//右括号
				if (stack.isEmpty())  return false;
				char left = stack.pop();
				
				if(left == '(' && c != ')') return false;
				if(left == '[' && c != ']') return false;
				if(left == '{' && c != '}') return false;
			}
		}
		return stack.isEmpty();
    }
}

package leetCode;

import java.util.Stack;

/*
 * A input String is valid if the open bracket close with the same type of brackets
 * if close and open in the same order
 * and finally every close bracket correspondly with the same type open
*/

public class ValidParenthesis {
	public static void main(String[] args) {
		String brack = "}{";
		System.out.println(isValid(brack));

	}

	public static boolean isValid(String s) {
		int contador = 0;

		Stack<Character> stackBrackets = new Stack<>();

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				stackBrackets.push(s.charAt(i));
				contador++;
			} else {
				if (stackBrackets.isEmpty()) {
					return false;
				};
				
				char character = stackBrackets.pop();

				if (s.charAt(i) == ')' && character == '(' || s.charAt(i) == '}' && character == '{'
						|| s.charAt(i) == ']' && character == '[') {
				} else {
					return false;
				}

				contador--;
			}

		}

		return contador == 0;
	}
}

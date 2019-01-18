package simple.brackets.codes.br;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 
 * 
 * Class that takes a string of brackets as the input, and determines if the order of
 * the brackets is valid. A bracket is considered to be any one of the following characters: (, ),
 * {, }, [, or ].
 * 
 * @author edson
 *
 */
public class ValidBrackets extends GetBracketsForValidation {

	/**
	 * 
	 * @param brackets
	 */
	@SuppressWarnings("static-access")
	public ValidBrackets(ArrayList<String> brackets) {
		this.brackets = brackets;
	}

	/**
	 * 
	 * Main method to execute the program
	 *  
	 * @param args
	 */
	public static void main(String[] args) {

		for (String bracket : brackets) {

			if (isParenthesisMatch(bracket)) {

				System.out.println(bracket + " IS VALID !");

			} else {
				System.out.println(bracket + " IS NOT VALID !");
			}

		}

	}

	/**
	 * We say a sequence of brackets is valid if the following conditions are met:
	 * 
	 * - It contains no unmatched brackets.
     * - The subset of brackets enclosed within the confines of a matched pair of brackets is
	 * also a matched pair of brackets.
	 * 
	 * ● (){}[] IS VALID
	 * ● [{()}](){} IS VALID
	 * ● []{() IS NOT VALID
	 * ● [{)] IS NOT VALID
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isParenthesisMatch(String str) {
		if (str.charAt(0) == '{')
			return false;

		Stack<Character> stack = new Stack<Character>();

		char c;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);

			if (c == '(')
				stack.push(c);
			else if (c == '{')
				stack.push(c);
			else if (c == ')')
				if (stack.empty())
					return false;
				else if (stack.peek() == '(')
					stack.pop();
				else
					return false;
			else if (c == '}')
				if (stack.empty())
					return false;
				else if (stack.peek() == '{')
					stack.pop();
				else
					return false;
		}
		return stack.empty();
	}

}

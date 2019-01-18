package simple.brackets.codes.br;

import java.util.ArrayList;

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
public class GetBracketsForValidation {

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
	 */
	protected static ArrayList<String> brackets = getBracketsForTest();

	/**
	 * 
	 */
	public GetBracketsForValidation() {
		super();
	}
	
	/**
	 * Start the array of brackets to test
	 * 
	 * @return
	 */
	static ArrayList<String> getBracketsForTest() {
		ArrayList<String> brackets = new ArrayList<>();

		brackets.add("(){}[]");
		brackets.add("[{()}](){}");
		brackets.add("[]{()");
		brackets.add("[{)]");

		return brackets;
	}

}
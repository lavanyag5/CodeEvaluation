/*
 * 5. Given 2 Strings, append them together and return the result.
 */

package co.practice;

public class StringAppend {

	public String strAppend(String input1, String input2) {
		// Without space
		String result = input1 + input2;
		return result;
	}

	public static void main(String[] args) {
		StringAppend append = new StringAppend();
		System.out.println("Result is " + append.strAppend("abcd", "pqrs"));
	}

}

//OUTPUT
// Scenario1 -> input1 -> abcd, input2-> pqrs, Result : abcdpqrs -> without space
// Sceanrio2 -> input1 -> abcd, input2-> pqrs, Result : abcd pqrs -> with space(String result=input1+ " "+input2)
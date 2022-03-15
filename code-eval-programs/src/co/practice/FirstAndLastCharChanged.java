/*
 * 10. Given a String, return a new string where the 1st and last chars have been changed.
 * Ex: input -> code, output ->edoc
 */

package co.practice;

public class FirstAndLastCharChanged {

	public String frontBackString(String str) {
		String result = " ";
		result = str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
		return result;
	}

	public static void main(String[] args) {
		FirstAndLastCharChanged charChanged = new FirstAndLastCharChanged();
		System.out.println("Result :" + charChanged.frontBackString("abcd"));
	}
}

//OUTPUT
// Scenario 1 -> input 1 -> abcd -> Result : dbca
// Scenario 2 -> input 2 -> code -> Result : eodc
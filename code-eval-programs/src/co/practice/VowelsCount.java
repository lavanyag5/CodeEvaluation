/*
 * 6. Pass a String as parameter, find out how many vowels present in it?
 */

package co.practice;

public class VowelsCount {

	public int vowelCount(String str) {
		int count = 0;
		String input = str.toLowerCase();
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
					|| input.charAt(i) == 'u') {
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		VowelsCount vow = new VowelsCount();
		System.out.println("Result :" + vow.vowelCount("aaeiouxyz"));
	}

}

//OUTPUT
//Scenario 1 -> input -> "aeiou" -> Result : 5
//Scenario 2 -> input -> "aaeiouxyz" -> Result : 6
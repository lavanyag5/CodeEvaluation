/*
 * 3. Pass an integer as parameter. Test whether the number is divisible by 7 or not?
 */

package co.practice;

public class DivisibleBy7 {

	public boolean divisibleBy7(int num) {
		if (num % 7 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		DivisibleBy7 div7 = new DivisibleBy7();
		System.out.println("Result : " + div7.divisibleBy7(45));
	}
}

//OUPUT
//scenario 1 -> input 49 -> Result :true
//scenario 2 -> input 45 -> Result :false

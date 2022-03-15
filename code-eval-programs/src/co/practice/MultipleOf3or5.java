/*
 * Return true if the given non-negative number is a multiple of 3 or a multiple of 5.Use % operator.
 */

package co.practice;

public class MultipleOf3or5 {

	public boolean multiple3or5(int num) {
		if (num % 3 == 0 || num % 5 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		MultipleOf3or5 mul35 = new MultipleOf3or5();
		System.out.println("Result : " + mul35.multiple3or5(16));
	}

}

//OUTPUT
//Scenario 1 -> input 15 -> Result : true
//Scenario 2 -> input 16 -> Result : false

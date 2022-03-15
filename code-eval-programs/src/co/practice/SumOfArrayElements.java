/*
 * 8. Given an array 'N' elements, return the sum of all array elements
 */

package co.practice;

public class SumOfArrayElements {

	public int arraySum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfArrayElements arrSum = new SumOfArrayElements();
		int[] array = { 2, 4, 1, 5 };
		System.out.println("Result :" + arrSum.arraySum(array));
	}

}

//OUTPUT
// Scenario 1 -> input 1 -> {2,5,8,7,5,3} -> Result : 30
// Scenario 2 -> input 2 -> {2,4,1,5} -> Result : 12
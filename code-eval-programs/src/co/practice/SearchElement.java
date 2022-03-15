/*
 * 9. Pass an int array and an int and do a search of the 2nd parameter in the 1st and return true or false?
 */

package co.practice;

public class SearchElement {

	public boolean searchArrElement(int[] array, int numberToSearch) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == numberToSearch) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		SearchElement search = new SearchElement();
		int[] arr = { 12, 5, 14, 6, 78 };
		System.out.println("Result :" + search.searchArrElement(arr, 12));

	}
}

//OUTPUT
// Scenario 1 -> input 1 -> ({12,5,14,6,78},2) -> Result : false
// Scenario 2 -> input 2 -> ({12,5,14,6,78},12) -> Result : true
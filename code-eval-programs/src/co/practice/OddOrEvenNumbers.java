package co.practice;

public class OddOrEvenNumbers {

	public String testOddOrEven(int num) {
		int rem = num % 2;
		if (rem % 2 == 0) {
			return "even";
		} else
			return "odd";
	}

	public static void main(String[] args) {
		OddOrEvenNumbers oe = new OddOrEvenNumbers();
		System.out.println("Result : " + oe.testOddOrEven(15));
	}

}

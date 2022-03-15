package co.practice;

/*
 * 1. Pass 2 ints as parameter and return the sum of numbers
 */

public class SumOf2Numbers {

	public long sum(int a, int b) {
		long sum;
		return sum = a + b;
	}

	public static void main(String[] args) {
		SumOf2Numbers sum2 = new SumOf2Numbers();
		System.out.println("Result : " + sum2.sum(10, -8));
	}
}

//OUTPUT
//input (4,8) -> Result : 12
// input (10,-8) -> Result : 2

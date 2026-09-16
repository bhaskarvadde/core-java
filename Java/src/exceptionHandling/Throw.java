package exceptionHandling;

public class Throw {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;

		// Checking whether the denominator is zero
		if (b != 0) {

			System.out.println(a / b);

		} else {

			// 'throw' is used to explicitly create and throw
			// an exception object.
			// Here, we are throwing an ArithmeticException
			// with a custom error message.
			throw new ArithmeticException("Dont send zeroes");
		}
	}
}

package exceptionHandling.UnCheckedExceptions;

public class NumberFormatExceptionDemo {

	public static void main(String[] args) {

		String str = "abc";

		try {
			int num = Integer.parseInt(str);
			System.out.println("Number: " + num);
		} catch (NumberFormatException e) {
			System.out.println("String cannot be converted into an integer");
			e.printStackTrace();
		}

		System.out.println("Program ended");
	}
}

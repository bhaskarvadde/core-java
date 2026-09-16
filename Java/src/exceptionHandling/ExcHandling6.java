package exceptionHandling;

public class ExcHandling6 {

	public static void main(String[] args) {
		System.out.println("main method started");

		try {
			System.out.println("In try 1");
			System.out.println(10 / 2);

			try {
				System.out.println("In try 2");
				System.out.println(10 / 0);
			} catch (Exception e) {
				System.err.println("In catch 2");
			}

		}
//		System.out.println("hello"); Invalid
		catch (Exception e) {
			System.err.println("In catch 1");

			try {
				System.out.println("In try 3");
			} catch (Exception e1) {
				System.err.println("In catch 3");
			}
		} finally {
			try {
				System.out.println("In try 4");
				System.out.println(10 / 0);
			} catch (Exception e1) {
				System.err.println("In catch 4");
				System.out.println(10 / 0);
			}
		}

		System.out.println("main method ended");
	}

}

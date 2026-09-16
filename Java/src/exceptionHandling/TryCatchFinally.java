package exceptionHandling;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			System.out.println("in try");
			System.out.println(10 / 0);
		} catch (Exception e) {
			System.err.println("in catch E");
		} finally {
			System.out.println("in finally");
		}
	}

}

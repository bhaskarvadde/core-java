package exceptionHandling;

public class MultipleCatch {

	public static void main(String[] args) {
		System.out.println("main method started");

		try {
			System.out.println("in try");
//			System.out.println(10 / 0);
			String s = null;
//			System.out.println(s.length());
			String s1 = "Boss";
			System.out.println(s1.charAt(4));
		} catch (ArithmeticException e) {
			System.err.println("in catch AE");
		} catch (NullPointerException e) {
			System.err.println("in catch NPE");
		} catch (StringIndexOutOfBoundsException e) {
			System.err.println("in String ind Ex");
		} catch (Exception e) {
			System.err.println("in catch E");
			System.err.println(e);
		} finally {
			System.out.println("in finally");
		}

		System.out.println("main method ended");
	}

}

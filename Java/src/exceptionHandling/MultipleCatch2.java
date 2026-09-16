package exceptionHandling;

public class MultipleCatch2 {

	public static void main(String[] args) {
		System.out.println("main method started");
//		System.exit(0); to stop the java application running
		try {
			System.out.println("in try");
//			System.out.println(10 / 0);
			String s = null;
			System.out.println(s.length());
//			String s1 = "Boss";
//			System.out.println(s1.charAt(4));
		} catch (ArithmeticException | NullPointerException | StringIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
//			System.exit(0);
		}finally {
			System.out.println("In finally");
//			System.exit(0);
		}
		
		System.out.println("main method ended");
	}

}

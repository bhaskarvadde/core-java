package exceptionHandling.CustomizedExceptions;

// Exception Propagation:
// The process of passing an exception from the method where it occurs
// to the calling method is called Exception Propagation.

public class ExceptionPropogation {

	// welcome() may throw InterruptedException because Thread.sleep()
	// can generate an InterruptedException.
	// Instead of handling it here, we propagate it to the caller (main()).
	static void welcome() throws InterruptedException {

		// Pauses the current thread for 2 seconds (2000 milliseconds).
		// This statement may throw InterruptedException.
		Thread.sleep(2000);

		System.out.println("Welcome called");
	}

	public static void main(String[] args) throws Exception {

		System.out.println("Hello main started");

		// Calling welcome().
		// Since welcome() declares "throws InterruptedException",
		// the exception is propagated to main().
		welcome();

		System.out.println("Hello main ended");
	}
}

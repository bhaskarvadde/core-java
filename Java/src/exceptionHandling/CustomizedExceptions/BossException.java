package exceptionHandling.CustomizedExceptions;

// Customized Exception / User-Defined Exception
// BossException is a custom exception created by the programmer.
// Since it extends RuntimeException, it is an Unchecked Exception.

public class BossException extends RuntimeException {

	// Default constructor
	// Used when we create the exception without passing a message.
	public BossException() {
	}

	// Parameterized constructor
	// Used to pass a custom error message to the exception.
	public BossException(String s) {

		// Calls the parent class (RuntimeException) constructor
		// and passes the message to it.
		super(s);
	}
}

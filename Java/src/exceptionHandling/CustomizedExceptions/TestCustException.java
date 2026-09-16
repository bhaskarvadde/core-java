package exceptionHandling.CustomizedExceptions;

// Customized Exception:
// An exception created by the programmer according to the application's
// requirement is called a Customized Exception / User-Defined Exception.

public class TestCustException {

	public static void main(String[] args) {

		// Age of the person
		int age = 17;

		// Checking whether the person is eligible to vote
		if (age >= 18) {

			System.out.println("You are eligible for voting");

		} else {

			// If age is less than 18, we explicitly create and throw
			// our customized BossException with a custom message.
			throw new BossException("Not eligible");
		}
	}
}

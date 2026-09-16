package exceptionHandling;

public class ExcHandling5 {

	int hello() {
//		try {
//			return 20;
//		} catch (Exception e) {
//			return 30; 
//		}

		try {
			return 20;
		} catch (Exception e) {
			return 30;
		} finally {
			return 40; // returns 40
		}
	}

	void main(String[] args) {
		System.out.println("main method started");
		
		System.out.println(hello());
	}

}

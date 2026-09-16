package exceptionHandling.CheckedExceptions;

import java.io.File;

public class IOException {

	public static void main(String[] args) {
		System.out.println("main method started");
		
//		IOException: The system cannot find the path specified , if path is wrong
		File f = new File("d:\\Users\\bhask\\OneDrive\\Documents\\ICET\\boss.txt");
		
		try {
			f.createNewFile();
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("main method ended");
	}

}

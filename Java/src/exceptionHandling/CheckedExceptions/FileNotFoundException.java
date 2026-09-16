package exceptionHandling.CheckedExceptions;

import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundException {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("main method started");

//		unhandled exception type FileNotFoundException 
		FileReader fr = new FileReader("C:\\Users\\bhask\\OneDrive\\Documents\\ICET\\boss.txtt");

//		unhandled exception type IOException
		int i = fr.read();

		while (i != -1) {
			Thread.sleep(200); 
			System.out.print((char) i);
			i = fr.read();
		}
		
		System.out.println();

		System.out.println("main method ended");
	}

}

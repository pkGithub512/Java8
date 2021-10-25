package testtry.catchexample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryTest {
	
	public static void main(String[] args) throws FileNotFoundException {
		try (Scanner scanner = new Scanner(new File("testRead.txt"));
			 PrintWriter writer = new PrintWriter(new File("testWrite.txt"))) {
			 while (scanner.hasNext()) {
				writer.print(scanner.nextLine());
			 }
		}finally {
			int a = 50/0;
			System.out.println(a);
		}
	}

}

package tough.question;

import java.util.stream.IntStream;

public class FactorialUsingJava8 {

	public static void main(String[] args) {
		int number = 5;
		System.out.println(IntStream.rangeClosed(2, number).reduce(1, (x, y) -> x * y));
	}
}

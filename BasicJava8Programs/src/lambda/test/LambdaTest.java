package lambda.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

interface Calculator{
	void sum(int i, int j);
}
public class LambdaTest {
	
	public static void main(String[] args) {
		
		Calculator calculator = (i, j) -> {
			System.out.println("Sum is " + (i + j) );
		};
		calculator.sum(10, 8);
		
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("abcd");
		list.add("abce");
		list.add("abdc");
		list.add("abec");
		list.add("abfc");
		
		List<String> sortedList = list.stream().sorted(Comparator.comparing(s -> s.length())).collect(Collectors.toList());
		System.out.println(sortedList);
	}
	
	//() -> {}
}

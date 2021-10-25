package practice.test;

import java.util.Arrays;
import java.util.List;

public class FindAllNumberStartingFrom1 {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		myList.stream().filter(i -> i/10==1).forEach(System.out::println);
		
		myList.stream()
        .map(s -> s + "") // Convert integer to String
        .filter(s -> s.startsWith("1"))
        .forEach(System.out::println);
	}
}

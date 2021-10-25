package practice.test;

import java.util.Arrays;
import java.util.List;

public class FindFirstElementOfList {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		Integer num = myList.stream().findFirst().get();
		System.out.println(num);
		
		//2nd Approach
		myList.stream().findFirst().ifPresent(System.out::println);
	}
}

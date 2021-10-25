package practice.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicatesInList {

	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		myList.stream()
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream().filter(m -> m.getValue()>1 )
		.map(Map.Entry::getKey)
		.collect(Collectors.toSet());
		
		
		//2nd Approach
		myList.stream().filter(i -> Collections.frequency(myList, i) >1).collect(Collectors.toSet()).forEach(System.out::println);
		
		//3rd Approach
		myList.stream().filter(i -> Collections.frequency(myList, i) > 1).forEach(System.out::println);
	}
}

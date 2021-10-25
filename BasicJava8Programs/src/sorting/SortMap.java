package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(3, "abcghj");
		map.put(4, "abghjc");
		map.put(1, "abch");
		map.put(2, "abcg");

		ArrayList<Integer> sortedKeys = new ArrayList<Integer>(map.keySet());

		Collections.sort(sortedKeys);
		
		//sortedKeys.stream().forEach(System.out::println);
		
		ArrayList<String> sortedValues = new ArrayList<String>(map.values());

		Collections.sort(sortedValues);
		
		//sortedValues.stream().forEach(System.out::println);
		
		//System.out.println("***************************");
		map.entrySet().stream().sorted((i1, i2) -> i1.getKey().compareTo( i2.getKey())).collect(Collectors.toMap(
            Map.Entry::getKey,
            Map.Entry::getValue,
            (e1, e2) -> e1, LinkedHashMap::new));
		
		int a = 12345;
		
		Integer[] tihNumbers = {11,12,22,15,86,55,33,64};
		
		//convert array to list
		List<Integer> numberList = Arrays.asList(tihNumbers);
		
		numberList.stream().sorted(Comparator.reverseOrder()).forEach(n -> System.out.println(n));
		System.out.println(numberList.stream().sorted(Comparator.reverseOrder()).findFirst());
		System.out.println(numberList.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst());
		//use stream and lambda expression to filter list and forEach print
		numberList.stream().filter(n -> n%2==0).forEach(System.out::println);
		
		IntStream.range(1, 101).filter(i -> i%2==0).forEach(n -> { System.out.println(n); });
		IntStream.rangeClosed(1, 100).filter(i -> i%2!=0).forEach(n -> System.out.println(n) );
		
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println(stats);
	}
	
	
	
	
}

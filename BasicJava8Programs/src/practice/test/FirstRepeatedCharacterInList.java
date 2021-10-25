package practice.test;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacterInList {

	public static void main(String[] args) {
		String input = "Java Hungry Blog Alive is Awesome";
		
		char result = input.chars().mapToObj(c -> (char)c)
		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		.entrySet()
		.stream()
		.filter(i -> i.getValue()> 1L)
		.map(entry -> entry.getKey())
		.findFirst()
		.get(); 
		System.out.println(result);
		
		 char output = input.chars().mapToObj(s -> (char)s)
		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new ,Collectors.counting()))
		.entrySet().stream().filter(e -> e.getValue()>1L).map(e->e.getKey()).findFirst().get();
		 System.out.println(output);
	}
}

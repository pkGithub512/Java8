package map.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Character, Integer> charsCount = new HashMap<>();
		
		String str1 = "abcdABCDabcd";

		char[] chars = str1.toCharArray();
		 
		for(char c : chars) {
			if(charsCount.containsKey(c)){
				charsCount.put(c, charsCount.get(c)+1);
			}else{
				charsCount.put(c, 1);
			}
		}
		System.out.println(charsCount);	
		
		Map<Character, Long> collect =  "abcsdnvs".chars().mapToObj(i -> (char)i).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        collect.forEach( (x,y) -> System.out.println( "Key: " + x + " Val: " + y));
		Optional<Character> firstNonRepeat = collect.entrySet().stream().filter( (e) -> e.getValue() == 1).map(e -> e.getKey()).findFirst();
		System.out.println(firstNonRepeat);
		
		String str  ="Hello World Test";
		//String reversed = str.chars().mapToObj(c -> (char)c).reduce("", (s,c) -> c+s, (s1,s2) -> s2+s1);
		//System.out.println(reversed);
	}
}

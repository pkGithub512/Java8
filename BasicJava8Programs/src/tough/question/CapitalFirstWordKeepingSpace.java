package tough.question;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CapitalFirstWordKeepingSpace {
	
	public static void main(String[] args) {
		String words = "hi pappu, welcome to kolkata";
		
		String capitalWords = Stream.of(words.trim().split("\\s"))
	    .filter(word -> word.length() > 0)
	    .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
	    .collect(Collectors.joining(" "));
		System.out.println(capitalWords);
		
		
		System.out.println(Stream.of(words.split(" ")).filter(s -> s.length()>0).map(word -> word.substring(0,1).toUpperCase() + word.substring(1) )
		.collect(Collectors.joining(" ")));
	}
	
	

}

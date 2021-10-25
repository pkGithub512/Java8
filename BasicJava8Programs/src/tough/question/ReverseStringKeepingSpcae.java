package tough.question;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseStringKeepingSpcae {

	public static void main(String[] args) {
		String words = "Hello to my world";
		
		//Reverse the String at its places while keeping space as it is
		System.out.println(Stream.of(words.split(" ")).filter(s -> s.length()>0)
		.map(s -> new StringBuilder(s).reverse()).collect(Collectors.joining(" ")));
		
		//Reverse the whole String
		Stream.of(words).map(s -> new StringBuffer(s).reverse()).forEach(System.out::println);
		
		String[][] nestedStr = {{"abc.def.ghi"},{"pqr.mno.stu"}};
		//nestedStr.stream().flatmap(row -> Arrays.stream(row.split(",")).collect(Collecttors.joining(",")));
	}
}

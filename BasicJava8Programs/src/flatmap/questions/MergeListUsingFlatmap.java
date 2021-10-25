package flatmap.questions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeListUsingFlatmap {
	
	public static void main(String[] args) {
		
		List<String> listOne = new ArrayList<String>();
		List<String> listTwo = new ArrayList<String>();
		List<String> listThree = new ArrayList<String>();
		
		listOne.add("Abc");
		listOne.add("Bcd");
		listOne.add("Cde");
		listOne.add("Def");
		listTwo.add("Abc");
		listTwo.add("Efg");
		listTwo.add("Fgh");
		listThree.add("ABC");
		
		List<String> newList = Stream.of(listOne, listTwo, listThree)
                .flatMap(List::stream).distinct() //List::stream or Collection::stream, both works
                .collect(Collectors.toList());
		
		System.out.println(newList);
	}

}

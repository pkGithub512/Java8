package practice.test;

import java.util.Arrays;
import java.util.List;

public class MaxValuePresentInList {

	public static void main(String[] args) {
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		 Integer num = myList.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		 System.out.println(num);
		 
		 
		 //2nd approach
		 int max = myList.stream().max(Integer::compare).get();
		 System.out.println(max);
	}
}

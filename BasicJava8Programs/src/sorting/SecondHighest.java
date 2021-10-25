package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondHighest {
	
	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<Employee>();
	    
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));

		Optional<Employee> emp = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
		
		//System.out.println(emp.get());
		
		String str = "Hellosdfdsfjhjh";
		
		str.chars().filter(ch -> ch =='e').count();
		
		
		int[] numbers={12,4,0,1,5,13,5,4,0,12,6,15,7,14};
		// Using Java 8 Streams perform the below operations
		// 1. Find the unique elements from the Array
		// 2. Sort the unique elements in descending order
		// 3. Save the top 3 values to a List<Integer> from the sorted values
		Stream.of(numbers).distinct().forEach(System.out::println);
		Stream.of(numbers).distinct().sorted(Collections.reverseOrder()).forEach(System.out::println);
		Stream.of(numbers).distinct().sorted(Collections.reverseOrder()).limit(3).forEach(System.out::println);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		
		for (int i : numbers) {
			list.add(i);
		}
		
		//1
		System.out.println("******1**********"); 
		//System.out.println(list.stream().sorted((i1, i2) -> i1.compareTo(i2)).collect(Collectors.toList()));
		System.out.println(list.stream().distinct().collect(Collectors.toList()));

		//2
		System.out.println("******2**********");
		//System.out.println(list.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList()));
		System.out.println(list.stream().distinct().sorted(Collections.reverseOrder()).collect(Collectors.toList()));
		//3
		System.out.println("******3**********");
		List<Integer> list3 = list.stream().sorted((i1, i2) -> i2.compareTo(i1)).limit(3).collect(Collectors.toList());
		System.out.println(list3);
		System.out.println(list.stream().distinct().sorted(Collections.reverseOrder()).limit(3).collect(Collectors.toList()));		
	}

	
}

package flatmap.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeListKeepingOneFieldUnique {
	
	 public static void main(String[] args) {
	        List<Dog> dogList1 = Arrays.asList(new Dog("a", 1), new Dog("b", 2), new Dog("f", 3));
	        List<Dog> dogList2 = Arrays.asList(new Dog("b", 4), new Dog("c", 5), new Dog("f", 6));
	        List<Dog> dogList3 = Arrays.asList(new Dog("b", 7), new Dog("d", 8), new Dog("e", 9));
	        List<Dog> dogs = new ArrayList<>(
	                Stream.of(dogList1, dogList2, dogList3)
	                        .flatMap(List::stream)
	                        .collect(Collectors.toMap(Dog::getName, d -> d, (Dog x, Dog y) -> x == null ? y : x))
	                        .values());
	        dogs.forEach(System.out::println);
	        
	        //Unique Names
	        List<String> dogNames = Stream.concat(dogList1.stream(),dogList2.stream())
                    .map(x -> x.getName())
                    .distinct()
                    .collect(Collectors.toList());
	        System.out.println(dogNames);
	    }
	}

	class Dog {
	    String name;
	    int id;

	    public Dog(String name, int id) {
	        this.name = name;
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    @Override
	    public String toString() {
	        return "Dog{" +
	                "name='" + name + '\'' +
	                ", id=" + id +
	                '}';
	    }
}

package polymorphism.test;

import java.util.HashSet;

class Country {
	 
	private String name;
	 
	Country(String name ){
	  this.name = name;
	}
	
	public String toString() {
	  return name;
	}
	 
	 @Override
	 public int hashCode() {
	  return 31;
	 }
	 
	 @Override
	 public boolean equals(Object obj) {
	  return true;
	 }
	}
public class PolymorphismTest {

	public static void main(String[] args) {
//		  HashSet myMap = new HashSet();
//		  Country s1 = new Country("Russia");
//		  Country s2 = new Country("china");
//		  Country s3 = new Country("France");
//		  Country s4 = new Country("US");
//		  myMap.add(s1);
//		  myMap.add(s2);
//		  myMap.add(s3);
//		  myMap.add(s4);
		//System.out.println(myMap);
		add(new String(""));
		sum(1L,1);
	}
	
	public static int exceptionTest()
	  {
	   int i=6;
	   try{
	    return i;
	   }
	   catch(Exception e)
	   {
	    i=10;
	 
	   }
	   finally
	   {
	    System.out.println("In finally block");
	   }
	   return i;
	  }
	
	public static void sum(int a, int b){
		System.out.println("from INT");
	}
	
	public static void sum(long a, long b){
		System.out.println("from Integer");
	}
	
	public static void sum(int a, long b){
		System.out.println("from int & long ");
	}
	
	public static void add(String s){
		System.out.println("String");
	}
	
	public static void add(Object s){
		System.out.println("Object");;
	}
	
	public static void add(StringBuffer s){
		System.out.println("StringBuffer");
	}
}

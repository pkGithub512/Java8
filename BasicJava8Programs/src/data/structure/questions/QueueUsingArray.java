package data.structure.questions;

import java.util.stream.IntStream;

public class QueueUsingArray {
 public static void main(String[] args) {
	 int[] arr = {0,1,2,3,4,5,6,7,8,9};
		int sumValue = IntStream.of(arr).filter( i -> i%2==0).map(i -> i).sum();
		System.out.println(sumValue);
}
 
 	public static boolean isPrime(int n){
 		return !IntStream.rangeClosed(2, n/2).anyMatch(i -> n%i == 0);
 	}
}

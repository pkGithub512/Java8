package prime.number.questions;

import java.util.stream.IntStream;

public class NumberIsPrimeOrNot {

		
	public static Boolean isPrime(Integer num){
		return !IntStream.rangeClosed(2, num/2).anyMatch(n -> num % n==0);
	}
	
	public static void main(String[] args) {
		int num = 88;
		Boolean isPrime=isPrime(num);
		System.out.println(num + " is prime : " + isPrime);
	}


}

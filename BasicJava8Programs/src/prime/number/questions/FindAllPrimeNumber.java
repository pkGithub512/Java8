package prime.number.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FindAllPrimeNumber {

	public static void main(String[] args) {
		int a = 2;
		int b = 100;
		List<Integer> primeNums= finePrimeNumber(a, b);
		System.out.println(primeNums);
	}
	
	public static List<Integer> finePrimeNumber(int a, int b){
		List<Integer> primes = new ArrayList<>();
		IntStream.range(2, 100)
		.filter(n -> primes.parallelStream().noneMatch(p -> n % p == 0) )
		.forEach(primes::add);
		return primes;
	}
	
	public static List<Integer> findAllPrime(){
		List<Integer> primes = new ArrayList<>();
		IntStream.rangeClosed(2, 100).filter(n -> primes.parallelStream().noneMatch(p -> n%p==0))
		.forEach(primes::add);
		return primes;
	}
	
}

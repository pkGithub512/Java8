package fibonacy.recusrion;

public class Fibonacy {

	public static void main(String[] args) {
		printFibonacciSeries(8);
	}
	
	public static void printFibonacciSeries(int count) {
		int a = 0;
		int b = 1;
		int c = 1;
		System.out.print(a);
		for (int i = 2; i <= count; i++) {
			c = a + b;// c=3, c=4
			a = b; // b=1, a=1, b,a=1
			b = c;//c=3,b=3, c,b=
			System.out.print(" " + c);//c=3
		}
	}
}

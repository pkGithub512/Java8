package checking.primitive;

public class PrimitiveTest {

	public static void main(String[] args) {
		int a = 200;
		Integer b = 200;
		Integer c = new Integer(200);
		System.out.println(a==b); //true
		System.out.println(a==c); //true
		
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		System.out.println(s1==s2); //true
		System.out.println(s1==s3); //false
	}
}

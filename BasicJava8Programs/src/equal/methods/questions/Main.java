package equal.methods.questions;

public class Main {

	public static void main(String[] args) {
		User u1 = new User();
		u1.setId(1);
		u1.setRollNo(10);
		u1.setName("abc");
		User u2 = new User();
		u2.setName("abc");
		u2.setId(1);
		u2.setRollNo(10);
		
		//If implement equals method in User class then it will return true, but if not implemented then it will be false
		System.out.println("Two objects are equals method  with .equal() method if override equal() methods : " + (u1.equals(u2)));
		
		//Compares references so it will be false always 
		System.out.println("Two objects are == ? : "+ (u1 == u2));//false
		System.out.println("Compare two objects String : " + u1.getName().equals(u2.getName()));	//true	
		System.out.println("Compare two Integer(wrapper) : " + u1.getId().equals(u2.getId())); //true
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println("String comparing with new keyword created & equals methods are equal : " + s1.equals(s2));//true
		System.out.println("String comparing with new keyword created & == methods are equal : " + s1==s2);//false
		
		//String & StringBuilder are not comparable, here content comparison .equals() will not work
		String s3 = "Hello";
		StringBuilder s4 = new StringBuilder("Hello");
		System.out.println("Compare String & StringBuilder with equals() : " + s3.equals(s4));
		
		
		//Comparing null.equal will give NPE while comparing String with NULL will not give NPE
		String s5 = "Hello";
		String s6 = null;
		System.out.println(s5.equals(s6));//False
		//System.out.println(s6.equals(s5));//will give NPE
		
		
		//Comparing LONG & INTEGER created with new keyword are not comparable, different reference so they will return false
		Integer a = new Integer(10);
		Long b = new Long(10L);
		System.out.println("Long & Integer with equals() : " + a.equals(b));
		System.out.println(b.equals(a));
		
		//below will return false
		Integer c = 10;
		Long d = 10L;
		System.out.println(c.equals(d)); //false
		System.out.println(d.equals(c)); //false
		
		
		Integer e = new Integer(100);
		Integer f = new Integer(100);
		System.out.println("Compare two Integer : " + e.equals(f));
		System.out.println(e==f);
		
		Integer g = new Integer(200);
		Integer h = new Integer(200);
		System.out.println(g.equals(h));
		System.out.println(g==h);
		
		//Note down below two examples, 100 to 100 comparison is true, above 127, comparison is false because JVM return false from cached pool, -128 to 127 
		Integer i = 100;
		Integer j = 100;
		System.out.println(i==j);
		
		Integer k = 200;
		Integer l = 200;
		System.out.println(k==l);
	}
}

package functional.interfaceExample;

public class DemoFunctionalInterfaceCall {
		public static void main(String[] args) {
			TestFunctionalInterfaceSum inter = (a,b)->a+b;
			System.out.println(inter.sum(5, 6));
		}
}

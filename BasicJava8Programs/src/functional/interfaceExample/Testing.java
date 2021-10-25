package functional.interfaceExample;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Testing {

	public static void main(String[] args) {
		int []a,b;
		Object[] names = new String[3];
		//names[0] = new Integer[0];
		
		Object obj = new Object();
		System.out.println(obj.getClass());
		
		A a1 = new A();
		A a2 = new A();
		a1.call(2, 3);
		System.out.println(a1.i +" " + a1.j);
		//System.out.println(a1.equals(a2));
		//a1.print();
		
		//String s = new String(null);
		//Integer i = new Integer(null);
		LinkedList<Integer> list = new LinkedList<>();
		list.add(-10);
		list.add(-8);
		list.add(-20);
		list.add(null);
		Comparator<Integer> r=  Collections.reverseOrder();
		Collections.sort(list,r);
		System.out.println(list);
	}
}
class A{
	
	public int i;
	int j;
	public A(){
		i=2;j=3;
	}
	void call(int a, int b){
		i = a+1;
		j=b;
	}
	void print(){
		System.out.println(" "+j);
	}
}
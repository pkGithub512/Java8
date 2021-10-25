package singleton.problems;

public class Singleton1 {

	private Singleton1(){
		
	}
	
	public static  Singleton1 instance =null;
	
	public static Singleton1 getInstance(){
		if(instance == null)
			return new Singleton1();
		
		return instance;		
	}
}

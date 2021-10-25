package functional.interfaceExample;

@FunctionalInterface
public interface MyFunctionalInterface extends MyAnotherInterface{
	public void print();
}
//Getting error because functional interface cannot extend other interface
//An abstract class cannot be instantiated
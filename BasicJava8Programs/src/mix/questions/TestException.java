package mix.questions;
import java.io.IOException;
public class TestException {
	public void m1() throws Exception{
	}
}
class Child extends TestException{
	public void m1() throws IOException{
	}
}

class Parent1{
	public void m1() throws IOException{
	}
}
class Child1 extends Parent1{
	//here you can't increase the scope of child class, we can decrease but we cant increase
	public void m1() throws Exception{
	}
}
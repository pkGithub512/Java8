package core.java.scenario.based.questions;

public class ExecuteProgramWithoutMain {

	
	//can a program can be called without without main()? 
	//Ans - Yes
	//How?
	//Ans - Using static block
	//Note - Below is the required program, but from java7, it is not allowed
	//From Java7, JVM check for Main method before initialization
   static{
      System.out.println("class without a main method");
      System.exit(0);
   }
	
}

package hcl.interview;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class HclDemo {

	public static void main(String[] args) {
		
		int[] arr = {12,3,6,1,9,6};
		int result = 24;
		
		for(int i=0; i< arr.length; i++){
			for(int j =0; j< i; j++){
				for(int k=0; k< j; k++){
					if(arr[i] + arr[j] + arr[k] == result){
						System.out.println( "numbers are " + arr[i] +" "+  arr[j] +" " + arr[k]);
					}
				}
			}
		}
		
		Runnable runnableTask = () -> {
		    try {
		        TimeUnit.MILLISECONDS.sleep(300);
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		};
		Callable<String> callableTask = () -> {
		    TimeUnit.MILLISECONDS.sleep(300);
		    return "Task's execution";
		};
		
		Callable<String> calltask = () -> {
			try{
				TimeUnit.MILLISECONDS.sleep(300);
				return "Sleeping";
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			return null;
		};

		ExecutorService executor = Executors.newFixedThreadPool(30);
		executor.execute(runnableTask);		
		executor.submit(calltask);
	}
}

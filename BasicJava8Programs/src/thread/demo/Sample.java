package thread.demo;

//My task is the tread class

class Task implements Runnable {

	@Override
	public void run() {
		int i = 0;

		while (i < 5) {
			System.out.println("My Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			++i;
		}

	}
}

//TEST
public class Sample {

	public static void main(String[] args) throws InterruptedException {

		// Create one object of Task Thread class
		System.out.println("Main Thread Started");

		Task mytask = new Task();

		Thread t1 = new Thread(mytask);
		t1.start();
		System.out.println("Child Thread Started");

		System.out.println("Main is waiting for child thread to finish");
		t1.join();
		System.out.println("Main Thread ends");

	}
}
package threads;

public class ThreadCreation implements Runnable {


	@Override
	public void run() {
		// 
		for(int j= 97; j< 123; j++) {
			System.out.println("Thread 1: "+(char)j);
		}
	}

}

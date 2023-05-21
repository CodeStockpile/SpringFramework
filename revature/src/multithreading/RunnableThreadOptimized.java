package multithreading;

// when object is required only at one time

public class RunnableThreadOptimized {
	
	public static void main(String[] args) {
	
	Thread t1 = new Thread(()-> 
	{
		for (int i = 1; i <= 10; i++) {
			System.out.println("class B");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	});
	
	
	Thread t2 = new Thread(()-> 
	{
		for (int i = 1; i <= 10; i++) {
			System.out.println("class B");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	});
	
	t1.start();
	t2.start();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {

		e.printStackTrace();
	}
		
	}
}

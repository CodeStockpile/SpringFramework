package multithreading;

public class RunnableAnonymousClass {

	public static void main(String[] args) {

		// Anonymous class
		
		Runnable obj1 = new Runnable() {
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("class A");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
			}

		};
		
		// normal concrete class (available due to public)
		
		B obj2 = new B();

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

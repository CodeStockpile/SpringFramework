package multithreading;

public class RunnableLambda {

	public static void main(String[] args) {

		// Anonymous class

		Runnable obj1 = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("class A");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}

		};

		Runnable obj2 = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("class B");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}

		};

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}
}

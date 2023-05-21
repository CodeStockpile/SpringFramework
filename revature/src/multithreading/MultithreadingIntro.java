package multithreading;

class A extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("class A");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class B extends Thread {
	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println("class B");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}

public class MultithreadingIntro {
	public static void main(String[] args) {

		A obj1 = new A();
		B obj2 = new B();

		// only extending doesn`t make thread
		// start method is required to be treat as thread

		obj1.start();
		obj2.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		obj1.show();
//		obj2.show();
	}
}

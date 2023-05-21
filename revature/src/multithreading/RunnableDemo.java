package multithreading;

class Abc  implements Runnable{
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


class Xyz implements Runnable  {
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



public class RunnableDemo {
	public static void main(String[] args) {
		
		Runnable obj1 = new A(); // valid and recommended
		B obj2 = new B(); // valid
		
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
		
		
//		obj1.show();
//		obj2.show();
	}
}

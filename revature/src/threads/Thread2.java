package threads;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int j= 97; j< 123; j++) {
			System.out.println("Thread2: "+(char)j);
		}
	}

}


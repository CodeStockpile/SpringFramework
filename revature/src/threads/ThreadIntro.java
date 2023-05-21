package threads;


public class ThreadIntro {

	public static void main(String[] args) {
		
//		long btime = System.currentTimeMillis();
//		System.out.println("Start time" + System.currentTimeMillis());
//		
//		task1();
//		for(int j= 97; j< 123; j++) {
//			System.out.println((char)j);
//		}
//		
//		long etime = System.currentTimeMillis();
//		System.out.println("End time" + System.currentTimeMillis());
//		System.out.println(" Toatal execution time: "+ (etime-btime) + "ms");
		
		
		long btime = System.currentTimeMillis();
		System.out.println("Start time" + System.currentTimeMillis());
		
		Thread thread1 = new Thread(new Thread2());
		thread1.start();
		
		Thread thread2 = new Thread(new ThreadCreation());
		thread2.start();

		long etime = System.currentTimeMillis();
		System.out.println("End time" + System.currentTimeMillis());
		System.out.println(" Toatal execution time: "+ (etime-btime) + "ms");
		
		
	}

	public static void task1() 
	{
		task2();
		for (int i = 97; i<123;i++) {
			System.out.println("Task1: "+(char)i);
			
		}
	}
	
	public static void task2() 
	{
		for (int i = 97; i<123;i++) {
			System.out.println("Task 2: "+(char)i);
			
		}
	}
}

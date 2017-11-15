
public class ThreadRunnerApp {
	
	static Runner tortoise = new Tortoise();
	static Runner hare = new Hare();
	
	public static void main(String[] args) {
		
		
		
		boolean flag = false;
		
		ThreadRunner thread1 = new ThreadRunner(tortoise);
		ThreadRunner thread2 = new ThreadRunner(hare);
		
		System.out.println("Get set...Go!");
		thread1.start();
		thread2.start();
		
		
		
		
		
	}

}

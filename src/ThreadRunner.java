
public class ThreadRunner extends Thread {

	Runner runner;

	public ThreadRunner(Runner runner ) {
		this.runner = runner;
	}

	public void run() {
		boolean running = true;

		while (running) {
			try {
				
			
			if ( (ThreadRunnerApp.tortoise.distance == 1000 || ThreadRunnerApp.hare.distance == 1000)) {
				running = false;
				if (runner.distance == 1000) {
					finished();
				}
			}	
			
			else {
				runner.run();

			}
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
		}
	}
	public void finished() {
		System.out.println(runner.name + ": I finished!");
		System.out.println();
		System.out.println("The race is over! The " + runner.name + " is the winner!");
		System.out.println();
		
		if (ThreadRunnerApp.tortoise.distance == 1000) {
			System.out.println(ThreadRunnerApp.hare.name + ": You beat me fair and sqaure, this time!");
		}
		else {
			System.out.println(ThreadRunnerApp.tortoise.name + ": You beat me fair and sqaure, this time!");

		}
		
	}

}

import java.util.Random;

public class Hare extends Runner {

	public Hare() {
		this.distance = 0;
		this.name = "Hare";
	}
	
	@Override
	public void run() {
		Random rand = new Random();
		int randNum = rand.nextInt(10) + 1;
		
		if (randNum > 9) {
			distance = distance + 100;
			System.out.println("Hare: " + distance);
		}
		
	}

}

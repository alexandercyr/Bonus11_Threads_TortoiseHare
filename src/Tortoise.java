
public class Tortoise extends Runner {

	public Tortoise() {
		this.distance = 0;
		this.name = "Tortoise";
	}
	
	@Override
	public void run() {
		distance = distance + 10;
		System.out.println("Tortoise: " + distance);
	}

}

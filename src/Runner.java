
public abstract class Runner {

	int distance;
	String name;
	
	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public abstract void run();
	
}

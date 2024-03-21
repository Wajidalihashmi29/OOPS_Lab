

public class Q4 {
	public static void main(String[]args) throws CollisionException{
		Vehicle v1 = new Vehicle(true);
		Vehicle v2 = new Vehicle(false);
		if (v1.direction != v2.direction) {
			throw new CollisionException("Collision Probability");
		}
	}
}

class Vehicle{
	boolean direction;
	Vehicle(boolean direction){
		this.direction = direction;
	}
}

class CollisionException extends Exception{
	public CollisionException(String error) {
		super(error);
	}
}
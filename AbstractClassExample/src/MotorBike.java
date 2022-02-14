
public abstract class MotorBike extends Bike {

	public void engine() {
		System.out.println("Engine");
	}

	public abstract void tire();

	public abstract void mirror();

	public void breaks() {
		System.out.println("breaks");
	}
}


public class MainMethod {

	public static void main(String[] args) {
		MotorBike bike = new MotorBike();
		bike.breaks();
		bike.engine();
		bike.mirror();
		bike.petrolTank();
		
		FzBike bike1 = new FzBike();
		bike1.breaks();
		bike1.engine();
		bike1.tire();
	}
}

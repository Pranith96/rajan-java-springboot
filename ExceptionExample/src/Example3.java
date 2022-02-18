
public class Example3 {

	public static void main(String[] args) {
		int num = 25;
		try {
			validate(num);
		} catch (CustomeRuntimeException ex) {
			ex.printStackTrace();
		}
	}

	private static void validate(int num) {

		if (num <= 25) {
			throw new CustomeRuntimeException("Number is not greater than 25");
		}
	}
}

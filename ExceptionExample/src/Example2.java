
public class Example2 {

	public static void main(String[] args) {
		int num = 25;
		try {
			validate(num);
		} catch (CustomCompileTimeException ex) {
			ex.printStackTrace();
		}
	}

	private static void validate(int num) throws CustomCompileTimeException {

		if (num <= 25) {
			throw new CustomCompileTimeException("Number is not greater than 25");
		}
	}
}

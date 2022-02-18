
public class Example1 {

	public static void main(String[] args) {

		int a = 10;
		try {
			int b = a / 0;
			System.out.println(b);
			String s = null;
			String s1 = s.toLowerCase();
			System.out.println(s1);

			int x[] = new int[3];
			x[0] = 1;
			x[1] = 2;
			x[2] = 3;
			x[3] = 4;
			x[4] = 5;
			System.out.println(x[3]);
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("World");
		}
		System.out.println("Hello");
		System.out.println("Hi");
	}
}

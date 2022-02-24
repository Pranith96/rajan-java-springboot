
public class MainMethod {

	public static void main(String[] args) {
		ThreadExample1 th = new ThreadExample1();
		ThreadExample1 th1 = new ThreadExample1();
		th.start();
		th1.start();
	}
}

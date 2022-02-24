
public class MainMethod {

	public static void main(String[] args) {
		ThreadExample2 ex = new ThreadExample2();
		Thread th = new Thread(ex);
		Thread th1 = new Thread(ex);
		th1.start();
		th.start();

	}
}


public class MainMethod {

	public static void main(String[] args) {
		ThreadExample3 th = new ThreadExample3();
		ThreadExample3 th1 = new ThreadExample3();
		th.start();
		try {
			th.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		th1.start();
	}
}

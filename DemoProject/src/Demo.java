
public class Demo {

	public static void main(String[] args) {
		int i = 10;
		String s = "Hello world";
		char ch = 'A';
		double d = 12.0d;
		long l = 123456778L;
		float f = 12.0f;

		System.out.println(i);
		System.out.println(i + " " + s + " " + ch + " " + d + " " + l + " " + f);

		Demo demo = new Demo();
		demo.hello();
		String str = "Java";
		demo.print(str);
		demo.display(s, i);
		add();
		int result = demo.sum(15, 5);
		System.out.println(result);

		Demo1 demo1 = new Demo1();
		demo1.hello();

		Demo1.hi();
	}

	public void hello() {
		System.out.println("Hello Welcome");
	}

	public void print(String message) {
		System.out.println(message);
	}

	public void display(String message, int i) {
		System.out.println(message + "  " + i);
	}

	public static void add() {
		System.out.println("Hello welcome to java");
	}

	public int sum(int a, int b) {
		int c = a + b;
		return c;
	}

}

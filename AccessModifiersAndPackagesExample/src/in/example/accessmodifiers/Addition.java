package in.example.accessmodifiers;

public class Addition {

	public void add1() {
		System.out.println("Add1");
		sum1();
	}

	private void sum1() {
		System.out.println("sum1");
	}

	protected void hi1() {
		System.out.println("hi1");
	}

	void hello1() {
		System.out.println("hello");
	}
}

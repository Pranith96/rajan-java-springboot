
public class Addition {

	private int i;
	private int j;

	public Addition() {
		System.out.println("In Addition");
	}

	public Addition(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public void print() {
		System.out.println(i + " " + j);
		System.out.println("Add: " +(i+j));
	}
}

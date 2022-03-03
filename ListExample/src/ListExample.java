import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ListExample {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		System.out.println(list);

		System.out.println(list.get(3));
		System.out.println(list.size());

		list.remove(0);
		System.out.println(list);

		for (Integer i : list) {
			System.out.println(i);
		}
		
		LinkedList<String> list1 = new LinkedList<>();
		list1.add("ABC");
		list1.add("XYZ");
		list1.add("UYJB");
		System.out.println(list1);
		
		for(String s : list1) {
			System.out.println(s);
		}
		
		Vector<Integer> vector = new Vector<>();
		
	}

}

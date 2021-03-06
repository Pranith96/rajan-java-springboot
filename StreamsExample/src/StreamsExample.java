import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 12, 11, 23, 21, 15, 13, 18, 19, 16, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> result = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(result);
		list.stream().map(y -> y * 5).forEach(z -> System.out.print(z + " "));
		System.out.println();
		list.stream().filter(x -> x % 2 == 0).map(y -> y * 5).forEach(z -> System.out.print(z + " "));
		System.out.println();
		list.stream().sorted().forEach(x -> System.out.print(x+ " "));
		System.out.println();
		Long data = list.stream().count();
		System.out.println(data);
	}
}

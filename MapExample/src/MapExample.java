import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapExample {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
		map.put(1, "ABC");
		map.put(2, "XYZ");
		map.put(3, "");
		map.put(4, "");
		map.put(5, "wer");
		map.put(6, "yu");
		map.put(1, "QWERT");
		map.put(7, "op");
		
		System.out.println(map);
		
		System.out.println(map.get(7));
		System.out.println(map.keySet());
		for(Map.Entry<Integer, String> mm : map.entrySet()) {
			System.out.println(mm.getKey()+ " " +mm.getValue());
			map.remove(5);
		}
	}

}


public class Example1 {
	
	public static void main(String[] args) {
		
		// Auto boxing
		int i = 10;
		Integer j = Integer.valueOf(i);
		
		Integer k = i;
		System.out.println(j+ " " +k);
		
		long ll = 100000000000l;
		Long l = Long.valueOf(ll);
		
		// unboxing
		Integer a = new Integer(10);
		int b = a.intValue();
		int c = a;
		
		Integer d = 100;
		String s = String.valueOf(d);
		System.out.println(s+100);
		
		String z = "100";
		Integer zz = Integer.parseInt(z);
		System.out.println(z+zz);
		
		Long lll = Long.parseLong(s);
	}

}

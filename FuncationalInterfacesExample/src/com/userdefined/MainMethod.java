package com.userdefined;

public class MainMethod {

	public static void main(String[] args) {
		Bike bikeImpl = new BikeImpl();
		bikeImpl.engine();

		Bike bike = () -> System.out.println("engine");
		bike.engine();
		Bike.hello();
		bike.hi();

		Addition ad = (a, b, c) -> {
			int d = a + b;
			int e = c * d;
			System.out.println(e);
		};
		ad.add(5, 5, 5);

		Addition2 ad2 = (a, b, c) -> {
			int d = a + b;
			int e = c * d;
			return e;
		};

		int result = ad2.add(5, 5, 5);
		System.out.println(result);
	}
}

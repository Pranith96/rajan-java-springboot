package com.userdefined;

public interface Bike {

	public void engine();

	public static void hello() {
		System.out.println("Hello");
	}

	default void hi() {
		System.out.println("hi");
	}
}

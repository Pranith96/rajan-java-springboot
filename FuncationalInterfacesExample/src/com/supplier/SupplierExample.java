package com.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {

		Supplier<Integer> s = () -> new Random().nextInt();
		Integer result = s.get();
		System.out.println(result);

		String name = "ABCDefgh";

		Supplier<Integer> s1 = () -> name.length();
		System.out.println(s1.get());
		Supplier<Boolean> s2 = () -> name.length() == 8;
		System.out.println(s2.get());
		Supplier<String> s3 = () -> name.toUpperCase();
		System.out.println(s3.get());
	}
}

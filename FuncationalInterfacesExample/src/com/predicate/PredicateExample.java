package com.predicate;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<Integer> i = t -> t % 2 == 0;
		System.out.println(i.test(2));
	}

}

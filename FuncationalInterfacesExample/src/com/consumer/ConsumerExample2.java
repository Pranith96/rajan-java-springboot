package com.consumer;

import java.util.function.Consumer;

public class ConsumerExample2 {

	public static void main(String[] args) {

		Consumer<String> consumer = t -> System.out.println(t + "Welcome");
		consumer.accept("ABC");
	}
}
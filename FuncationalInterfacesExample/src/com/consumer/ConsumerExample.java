package com.consumer;

import java.util.function.Consumer;

public class ConsumerExample implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t + " welcome");
	}

	public static void main(String[] args) {
		ConsumerExample consumerExample = new ConsumerExample();
		consumerExample.accept("ABC");
	}
}

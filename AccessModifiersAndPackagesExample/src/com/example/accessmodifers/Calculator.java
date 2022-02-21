package com.example.accessmodifers;

public class Calculator {

	public void add() {
		System.out.println("Add");
		sum();
	}

	private void sum() {
		System.out.println("sum");
	}

	protected void hi() {
		System.out.println("hi");
	}

	void hello() {
		System.out.println("hello");
	}
}

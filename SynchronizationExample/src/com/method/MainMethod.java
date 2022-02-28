package com.method;

public class MainMethod {

	public static void main(String[] args) {
		Resourse resourse = new Resourse();
		Thread1 thread1 = new Thread1(resourse);
		thread1.start();
		Thread2 thread2 = new Thread2(resourse);
		thread2.start();
	}
}

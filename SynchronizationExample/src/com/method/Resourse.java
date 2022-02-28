package com.method;

public class Resourse {

	public synchronized void printThread(int num) {
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i * num);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Hii");
		System.out.println("Helllo");
		System.out.println("welcome");
	}

}

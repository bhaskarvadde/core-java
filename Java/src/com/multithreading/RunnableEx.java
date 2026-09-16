package com.multithreading;

public class RunnableEx implements Runnable {

	@Override
	public void run() {
		System.out.println("run method started");
		System.out.println(Thread.currentThread());

		for (int i = 0; i <= 10; i++) {
			System.out.println("run" + i);
		}

		System.out.println("run method ended");
	}

	public static void main(String[] args) {

		System.out.println("main method started");

		RunnableEx m = new RunnableEx();

		Thread t = new Thread(m);

		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("main" + i);
		}

		System.out.println("main method ended");

	}

}

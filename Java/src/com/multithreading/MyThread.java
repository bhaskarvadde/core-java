package com.multithreading;

public class MyThread extends Thread{

//	whenever the child class is not happy with the parent class functionalities
//	then go and create the same method with same signature in the
//	child class with different bahaviour is the concept called overriding
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
		System.out.println(Thread.currentThread());

		MyThread m = new MyThread();

		// causes this thread to begin execution
		// JVM calls run method of this Thread(MyThread)
		m.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("main" + i);
		}

		System.out.println("main method ended");
	}

}

package com.multithreading;

public class TestThread1 {

	public void walk() {
		System.out.println("walk method called");
		System.out.println(Thread.currentThread());
	}

	public void run() {
		System.out.println("run method called");
		System.out.println(Thread.currentThread());
	}

	void main(String[] args) {
		System.out.println("main method started");
		System.out.println(Thread.currentThread());
		walk();
		run();
		System.out.println("main method ended");
	}

}

package com.oops.typesOfInheritance.multipleInheritanceWithInterfaces;

public class SmartTV implements SwitchableInterface, InternetEnabledInterface{

	@Override
	public void turnOn() {
		System.out.println("Turned on");
	}

	@Override
	public void turnOff() {
		System.out.println("Turned Off");		
	}

	@Override
	public void connectWifi() {
		System.out.println("Wifi Connected");		
	}

	@Override
	public void disconnectWifi() {
		System.out.println("Wifi Disconnected");		
	}
	
	// Overriding default method from interfaces
	@Override
	public void power() {
		System.out.println("Overrided method from interfaces");
		InternetEnabledInterface.super.power();
	}
	
}

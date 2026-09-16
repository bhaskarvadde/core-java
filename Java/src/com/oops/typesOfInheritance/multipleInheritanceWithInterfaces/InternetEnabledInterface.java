package com.oops.typesOfInheritance.multipleInheritanceWithInterfaces;

public interface InternetEnabledInterface {
	void connectWifi();
	void disconnectWifi();
	
	default void power() {
		System.out.println("Power is ON in Interface 2"); 
	}
}

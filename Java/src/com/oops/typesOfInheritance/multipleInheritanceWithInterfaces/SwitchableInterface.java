package com.oops.typesOfInheritance.multipleInheritanceWithInterfaces;

public interface SwitchableInterface {
	void turnOn();
	void turnOff();
	default void power() {
		System.out.println("Power is ON in Interface 1");
	}
}

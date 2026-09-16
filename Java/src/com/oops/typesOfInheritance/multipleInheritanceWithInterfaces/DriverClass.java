package com.oops.typesOfInheritance.multipleInheritanceWithInterfaces;

public class DriverClass {

	public static void main(String[] args) {
		SmartTV s = new SmartTV();
		
		s.turnOn();
		s.turnOff();
		s.connectWifi();
		s.disconnectWifi();
		
//		Duplicate default methods named power with the parameters () and () are inherited from 
//		the types InternetEnabledInterface and SwitchableInterface
//		s.power();
		
//		after overriding default method in class which is SmartTV
		s.power();
	}

}

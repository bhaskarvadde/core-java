package com.lab;

public class Hospital {
	static String hospitalName = "Boss Hospitals";
	int patientId;
	String patientName;
	double treatmentCost;
	 
	void calculateBill() {
		System.out.println("Hospital Name: " + hospitalName);
		System.out.println("Patient Id: " + patientId);
		System.out.println("Patient Name: " + patientName); 
		
		double totalCost = treatmentCost + 1200 ;
		 
		System.out.println("Treatment Cost: " + totalCost);
	}
 
	public static void main(String[] args) {
		System.out.println("Boss Hospitals");
		System.out.println("----------------------");  
		
		Hospital obj = new Hospital();
		obj.patientId = 4587;
		obj.patientName = "Balaji";
		obj.treatmentCost = 54546.51D;
		
		obj.calculateBill(); 
 
	}
	
	

}

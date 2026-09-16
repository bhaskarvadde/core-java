package com.fundamentals.constructorsSuperOf;

class Hospital {
	String hospitalName;
	String city;
	int bedCapacity;

	Hospital(String hospitalName, String city, int bedCapacity) {
		this.hospitalName = hospitalName;
		this.city = city;
		this.bedCapacity = bedCapacity;
	}
	
	public static void Main(String[] args) {
		Hospital h = new Hospital("Kims","Hyd",1000); 
		System.out.println(h.hospitalName);
		System.out.println(h.city);
		System.out.println(h.bedCapacity); 
	}
}

 public class Doctor extends Hospital {
	String doctorName;
	String specialization;

	Doctor(String hospitalName, String city, int bedCapacity,String doctorName, String specialization) {
		super(hospitalName,city,bedCapacity);
		this.doctorName = doctorName;
		this.specialization = specialization;
	}

	public static void main(String[] args) {
		Doctor d = new Doctor("Kims","Hyd",1000,"Sampath", "Dermotologist");
		System.out.println(d.doctorName);
		System.out.println(d.specialization);
		System.out.println(d.hospitalName);
		System.out.println(d.city);
		System.out.println(d.bedCapacity); 

	}

}

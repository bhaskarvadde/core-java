package com.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection2 {

	public static void main(String[] args) {
		Collection<String> teamA = new ArrayList<>();

		teamA.add("Mersedese Benz");
		teamA.add("BMW");
		teamA.add("Audi");
		teamA.add("Maserati");

		System.out.println(teamA);

		Collection<String> teamB = new ArrayList<>();

		teamB.add("Rolls Royce");
		teamB.add("Buggati");
		teamB.add("Ferrari");
		teamB.add("Tata");

		System.out.println(teamB);

		Collection<String> carTeam = new ArrayList<>();
//		method - addAll()
		carTeam.addAll(teamA);
		carTeam.addAll(teamB);
		System.out.println(carTeam);

//		method - clear() -- used to remove total collection
//		teamA.clear();

		System.out.println(teamA);
		System.out.println(carTeam);

//		method - contains() - checks one element 
		System.out.println(teamB.contains("Tata")); // true

//		method - containsAll() - checks all elements in a collection
		System.out.println(carTeam.containsAll(teamB));// true

		Collection<String> teamC = new ArrayList<>(); // []

		System.out.println(carTeam.containsAll(teamC));// true - teamC has nothing [] and carTeam has nothing []

		teamA.remove("Audi");
		System.out.println(teamA);

//		method - removeAll() -- used to remove a collection in a collection of collections
		carTeam.removeAll(teamB);
		System.out.println(carTeam);

//		method - size() 
		System.out.println(carTeam.size());

//		method - toArray()
		Object[] objArr = carTeam.toArray();

		for (Object obj : carTeam) {
			System.out.println(obj);
		}

	}

}

package com.lab;

public class Movie {

	int movieId;
	String movieName;
	String heroName;
	double rating;

	Movie() {
		System.out.println("no arg called");
	}

	Movie(int movieId) {
		this();
		System.out.println("1 arg called");
		this.movieId = movieId;
	}

	Movie(int movieId, String movieName) {
		this(movieId);
		System.out.println("2 arg called");

		this.movieName = movieName;
	}

	Movie(int movieId, String movieName, String heroName) {
		this(movieId, movieName);
		System.out.println("3 arg called");

		this.heroName = heroName;
	}

	Movie(int movieId, String movieName, String heroName, double rating) {

		this(movieId, movieName, heroName);

		this.rating = rating;

		System.out.println("4 arg called");
	}

	void display() {
		System.out.println("Movie Id: " + movieId);
		System.out.println("Movie Name: " + movieName);
		System.out.println("Hero Name: " + heroName);
		System.out.println("Rating: " + rating);
		System.out.println();
	}

	public static void main(String[] args) {

		Movie m1 = new Movie(1, "Salaar", "Prabhas", 10.0);
		m1.display();

		Movie m2 = new Movie(2, "Dhruva", "Ram Charan", 9.0);
		m2.display();
	}
}
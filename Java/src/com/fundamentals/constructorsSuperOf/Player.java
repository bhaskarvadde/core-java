package com.fundamentals.constructorsSuperOf;

class Game {
	String gameName;
	String genre;
	int maxPlayers;

	Game(String gameName, String genre, int maxPlayers) {
		this.gameName=gameName;
		this.genre=genre;
		this.maxPlayers = maxPlayers;
	}

}

public class Player extends Game {
	String playerName;
	int score;
	int level;

	Player(String gameName, String genre, int maxPlayers,String playerName, int score, int level) {
		super(gameName,genre,maxPlayers);
		this.playerName = playerName;
		this.score = score;
		this.level = level;
	}

	public static void main(String[] args) {
		Player p = new Player("Cricket","s",11,"Dhoni", 100, 8); 
		System.out.println(p.gameName);
		System.out.println(p.genre);
		System.out.println(p.maxPlayers);
		System.out.println(p.playerName);
		System.out.println(p.score);
		System.out.println(p.level); 
	}

}

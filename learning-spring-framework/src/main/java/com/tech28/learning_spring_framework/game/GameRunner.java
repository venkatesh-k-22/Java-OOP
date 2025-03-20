package com.tech28.learning_spring_framework.game;

public class GameRunner {
	
	//private MarioGame game;
	
	private Game game;

	public GameRunner(Game game) {
		this.game = game;		
	}

	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
	}

}

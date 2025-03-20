package com.tech28.learning_spring_framework.game;

public class MarioGame implements Game {
	
	public void up() {
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("enter in to the hole");
	}
	
	public void left() {
		System.out.println("stop");
	}
	
	public void right() {
		System.out.println("Accelarate");
	}

}

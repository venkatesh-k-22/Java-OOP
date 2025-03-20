package com.tech28.learning_spring_framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tech28.learning_spring_framework.game.MarioGame;
import com.tech28.learning_spring_framework.game.SuperContra;
import com.tech28.learning_spring_framework.game.GameRunner;

@SpringBootApplication
public class LearningSpringFrameworkApplication {

	public static void main(String[] args) {
//		SpringApplication.run(LearningSpringFrameworkApplication.class, args);
		//Tightly coupled
		//we can't use 2 class reference at a time bcz it was tightly coupled
		MarioGame marioGame = new MarioGame();
		SuperContra superContra = new SuperContra()
;		GameRunner gameRunner = new GameRunner(superContra);
		gameRunner.run();	
	}

}

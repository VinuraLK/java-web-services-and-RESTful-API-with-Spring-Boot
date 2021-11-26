package com.in28minutes.Simple.gaming.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.Simple.gaming.app.game.GameRunner;
import com.in28minutes.Simple.gaming.app.game.MarioGame;

@SpringBootApplication
public class SimpleGamingAppApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SimpleGamingAppApplication.class, args);
		
		MarioGame game = new MarioGame();
		
		GameRunner runner = new GameRunner(game);
		
		runner.runGame();
	}

}

package com.in28minutes.Simple.gaming.app.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("asdasda");
	}
	
	@Override
	public void down() {
		System.out.println("asdasd");
	}
	
	@Override
	public void left() {
		System.out.println("asdasd");
	}
	
	@Override
	public void right() {
		System.out.println("asdasd");
	}
}

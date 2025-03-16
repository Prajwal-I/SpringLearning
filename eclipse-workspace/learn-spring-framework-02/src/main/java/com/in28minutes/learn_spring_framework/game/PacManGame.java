package com.in28minutes.learn_spring_framework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacManGame implements GamingConsole {

	public void up() {
		System.out.println("UP-pac");		
	}

	public void down() {
		System.out.println("DOWN-pac");
		
	}

	public void left() {
		System.out.println("LEFT-pac");
		
	}

	public void right() {
		System.out.println("Right-pac");
		
	}

}

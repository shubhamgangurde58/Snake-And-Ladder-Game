package com.shubham.snakeandladder;

import java.util.Random;

public class SnackAndLadderGame {

	private int playerPosition = 0;
	
	public void ShowPosition() {
		
		System.out.println("Player position = "+playerPosition);
	}
	
	public void PlayGame() {
		
		Random random = new Random();
		
			int dieNo = random.nextInt(6)+1;
			System.out.println("die No="+dieNo);
		
	}
	public static void main(String[] args) {
		
		System.out.println("Welcome to Snake and Ladder Game ");
		
		SnackAndLadderGame snackandladdergame1 = new SnackAndLadderGame();
		 snackandladdergame1. ShowPosition();
		 snackandladdergame1.PlayGame();
	}

}

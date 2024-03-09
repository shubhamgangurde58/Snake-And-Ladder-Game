package com.shubham.snakeandladder;

public class SnackAndLadderGame {

	private int playerPosition = 0;
	
	public void ShowPosition() {
		
		System.out.println("Player position = "+playerPosition);
	}
	public static void main(String[] args) {
		
		System.out.println("Welcome to Snake and Ladder Game ");
		
		SnackAndLadderGame snackandladdergame1 = new SnackAndLadderGame();
		 snackandladdergame1. ShowPosition();
	}

}

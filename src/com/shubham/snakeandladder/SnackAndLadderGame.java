package com.shubham.snakeandladder;

import java.util.Random;

public class SnackAndLadderGame {

	private int playerPosition = 0;
	private static final int NO_PLAY = 0;
	private static final int LADDER = 1;
	private static final int SNACK = 2;
	
	public void ShowPosition() {
		
		System.out.println("Player position = "+playerPosition);
	}
	
	public void PlayGame() {
		
		Random random = new Random();
		
			int dieNo = random.nextInt(6)+1;
			System.out.println("die No="+dieNo);
			int option = random.nextInt(3);
			System.out.println("option ="+option);
			
			switch(option)
			{
			case NO_PLAY:
				playerPosition = playerPosition ;
				break;
			case LADDER:
				playerPosition = playerPosition + dieNo;
				break;
			case SNACK:
				playerPosition = playerPosition - dieNo ;
				if( playerPosition < 0)
				{
					playerPosition = 0;
				}
				break;
			}
		
	}
	public static void main(String[] args) {
		
		System.out.println("Welcome to Snake and Ladder Game ");
		
		SnackAndLadderGame snackandladdergame1 = new SnackAndLadderGame();
		 snackandladdergame1. ShowPosition();
		 snackandladdergame1.PlayGame();
		 snackandladdergame1. ShowPosition();
		
		 
	}

}

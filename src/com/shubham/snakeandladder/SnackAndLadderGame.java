package com.shubham.snakeandladder;

import java.util.Random;

public class SnackAndLadderGame {

	private int playerPosition = 0;
	private static final int NO_PLAY = 0;
	private static final int LADDER = 1;
	private static final int SNACK = 2;
	private static final int WININGPOSITION = 100;
	
	private static int rolldiecount = 0;
	public void ShowPosition() {
		
		System.out.println("Player position = "+playerPosition);
	}
	
	public void PlayGame() {
		
		Random random = new Random();
		
		while(playerPosition < WININGPOSITION )
		{
			int dieNo = random.nextInt(6)+1;
			System.out.println("die No="+dieNo);
			int option = random.nextInt(3);
			System.out.println("option ="+option);
			
			rolldiecount += 1; 
			System.out.println("--------------------------");
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
					playerPosition =  0;
				}
				break;
			}
			if(playerPosition > WININGPOSITION )
			{
				playerPosition = playerPosition - dieNo;
			}
			
			ShowPosition();
			System.out.println("Rolling die count = "+rolldiecount);
		}
		
			
	}
	public static void main(String[] args) {
		
		System.out.println("Welcome to Snake and Ladder Game ");
		
		SnackAndLadderGame snackandladdergame1 = new SnackAndLadderGame();
		 snackandladdergame1. ShowPosition();
		 snackandladdergame1.PlayGame();
		// snackandladdergame1. ShowPosition();
		 
		 
	}

}

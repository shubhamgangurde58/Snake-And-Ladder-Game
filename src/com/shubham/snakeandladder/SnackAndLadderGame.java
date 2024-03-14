package com.shubham.snakeandladder;

import java.util.Random;

public class SnackAndLadderGame {

	private int playerPosition = 0;
	private static final int NO_PLAY = 0;
	private static final int LADDER = 1;
	private static final int SNACK = 2;
	private static final int WININGPOSITION = 100;
	
	private int rolldiecount = 0;
	private int winplayer = 0;
	public void ShowPosition() {
		
		System.out.println("Player position = "+playerPosition);
	}
	
	public int PlayGame() {
		
		Random random = new Random();
		//ShowPosition();
		while(playerPosition < WININGPOSITION )
		{
			int dieNo = random.nextInt(6)+1;
			//System.out.println("die No="+dieNo);
			int option = random.nextInt(3);
			//System.out.println("option ="+option);
			
			 rolldiecount += 1; 
			
			//System.out.println("--------------------------");
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
			
			
		}
		System.out.println("Rolling die count = "+rolldiecount);

		return rolldiecount;

	}
	
	public void winPlayer(SnackAndLadderGame player2) {
		
		if(this.PlayGame() == player2.PlayGame()) {
			System.out.println("Game is tie");
		}else if(this.PlayGame() < player2.PlayGame())
		{
			System.out.println("player 1 is win");
		}else {
			System.out.println("player 2 is win");
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Welcome to Snake and Ladder Game ");
		
		SnackAndLadderGame player1 = new SnackAndLadderGame();
		
			System.out.println("Player 1 ");
			player1.ShowPosition();
			player1.PlayGame();
			player1.ShowPosition();
	 	
		 	System.out.println("---------------------------------");
		 	System.out.println("---------------------------------");
		
		 	SnackAndLadderGame player2 = new SnackAndLadderGame();
			System.out.println("Player 2");
			player2.ShowPosition();
		 	player2.PlayGame();
		 	player2.ShowPosition();
		 	
		 	System.out.println("---------------------------------");
		 	System.out.println("---------------------------------");
		
		 	player1.winPlayer(player2);
	}

}

package com.adneom.tennisKata;

public class Game {
	private Player player1;
	private Player player2 ;
	
	public String getScore() {        
		if (player1.getScore() >= 3 && player2.getScore() >= 3) {
        if (Math.abs(player2.getScore() - player1.getScore()) >= 2)  {
            return getWinner().getName() + " won";
        }  else if (player1.getScore() == player2.getScore()) {
            return "deuce";
        } else {
            return "advantage " + getWinner().getName();
        }
    } else {
        return player1.getScore() + ", " + player2.getScore();
    }
	}
	
	public Player getWinner() {
        return (player1.getScore() > player2.getScore()) ? player1 : player2;
    }

}

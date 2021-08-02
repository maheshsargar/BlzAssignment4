package com.assignment.dayfour;

import java.util.Random;

public class SnakeLadder {
	 public static Random random = new Random();
	    public static int diceRoll, slnp, player,turns;

	    public static void main(String[] args) {
	        Loop();

	    }

	    public static void Dice() {
	        turns = turns + 1;
	        int diceroll = random.nextInt(6);  
	        diceRoll = diceroll + 1;
	        
	    }

	    public static void SLNP() {
	        int slnoplay = random.nextInt(3);
	        slnp = slnoplay + 1;
	        if (slnp == 1) {// No play
	        } else if (slnp == 2) {// Ladder play
	            Dice();
	            player = player + diceRoll;
	        } else {// Snake play
	            Dice();
	            player = player - diceRoll;
	            if (player < 0) {
	                player = 0;
	            }
	        }
	    }

	    public static void Loop() {
	        while (player < 100) {
	            SLNP();
	        }
	        if (player == 100) {
	            System.out.println("Congratulations : You WIN");
	            System.out.println("Total dice rolled : "+ turns);
	        } else {
	            player = player - diceRoll;
	            Loop();
	        }

	    }


}
	

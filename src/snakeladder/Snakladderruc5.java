package snakeladder;

import snakeladder.utility.Utility;

public class Snakladderruc5 {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake-Ladder Game");
        int player = 0;
        Utility utility = new Utility();
        utility.rollDice();
        utility.winning(player);// calling winning method
    }

}

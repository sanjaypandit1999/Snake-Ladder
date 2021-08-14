package snakeladder;

import snakeladder.utility.Utility;

public class Snakladderruc6 {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake-Ladder Game");
        int player1= 0;
        int player2 = 0;
        int totalRound = 0;
        Utility utility = new Utility();
        while ( player1 !=100) {
            while (player1 <= 100 || player2 <= 100) {
                totalRound++;
                System.out.println("Round " + totalRound);
                System.out.println("Round  " + totalRound);
                //turn player1
                player1 += utility.rollDice();                        //Calling diceRoll method
                System.out.println("Intermediate Position " + player1);
                System.out.println("Intermediate Position for P1 " + player1);
                player1 = utility.winning(player1);                    //Calling option method for Snake Ladder or NoPlay
                System.out.println("final Position " + player1);
                System.out.println("final Position for P1 " + player1);
                    if (player1 == 100){
                        System.out.println("player1 won the match");
                    }
                //turn player 2
                player2 += utility.rollDice();                        //Calling diceRoll method
                System.out.println("Intermediate Position " + player2);
                System.out.println("Intermediate Position for turn no 1 " + player2);
                player2 = utility.winning(player2);                    //Calling option method for Snake Ladder or NoPlay
                System.out.println("final Position " + player2);
                if (player2 == 100) {
                    System.out.println("player2 won the match");
                    break;
                }
            }
        }
    }

}

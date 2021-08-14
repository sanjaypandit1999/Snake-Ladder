package snakeladder.utility;

public class Utility {
    public static int isSnake = 2, isLadder = 1;
    static int option;
    static int diceRollCount = 0;

    //UC2
    public int rollDice() {
        option = 1 + (int) (Math.random() * ((6 - 1) + 1));
        System.out.println("The dice number is " + option);
        return option;
    }

    //uc3
    public int playerOption(int newPosition) {

        int randomCheck = (int) (Math.random() * 3);
        if (randomCheck == isLadder) {
            System.out.println("the dice number is " + option);
            newPosition = newPosition + option;
            diceRollCount++;
        } else if (randomCheck == isSnake) {
            System.out.println("now it is snake");
            newPosition = (newPosition - option);
            diceRollCount++;
        } else {
            System.out.println(" player is no play");
        }
        System.out.println("new position is " + newPosition);
        return newPosition;
    }

    //UC5
    public int winning(int newPosition) {
        Utility sc = new Utility(); //calling object
        int previousPosition = 0; // intialize
        //doiing for loop for wiining score 100
        for (newPosition = 0; newPosition <= 100; ) {
            newPosition = sc.playerOption(newPosition);//calling snake ladder and no play method
            diceRollCount++;
            if (newPosition == 100 ){
                System.out.println("Player won the game");
                break;
            }
            //if upper 100 score then back to previousscore then playing untill reach 100 winning score
            else if (newPosition > 100) {
                previousPosition = newPosition - option;
                System.out.println("Back previous position " + previousPosition);
                diceRollCount++;
                if (previousPosition == 100) {
                    System.out.println("player won the game");
                }
                    else
                    System.out.println(" once more rolls the dice");
            } else if (newPosition  < 100) {
                System.out.println("once more rolls the dice");
            }
        }
        System.out.println("The dice roll count is " +diceRollCount);
        return newPosition;
    }
}

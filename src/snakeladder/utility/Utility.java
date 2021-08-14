package snakeladder.utility;

public class Utility {
    public int rollDice(){
        int option = 1 + (int)(Math.random() * ((6 -1) + 1));
        System.out.println("The dice number is " +option);
        return option;
    }
    public int playerOption(int newPosition) {
        int isSnake = 2, isLadder =1;
        Utility sc = new Utility();
        int randomCheck = (int) (Math.random() * 3);
        if (randomCheck == isLadder) {
            System.out.println("now it is Ladder");
            newPosition = newPosition + sc.rollDice();
        }
        else if(randomCheck == isSnake) {
            System.out.println("now it is snake");
            newPosition = (newPosition - sc.rollDice());
        }
        else{
                System.out.println(" player is no play");
        }
        System.out.println("new position is " + newPosition);
        return newPosition;
    }
}

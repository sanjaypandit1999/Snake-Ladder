package snakeladder.utility;

public class Utility {
    public static  int isSnake = 2, isLadder =1;
    //UC2
    public int rollDice(){
        int option = 1 + (int)(Math.random() * ((6 -1) + 1));
        System.out.println("The dice number is " +option);
        return option;
    }
    //uc3
    public int playerOption(int newPosition) {

        Utility sc = new Utility();
            int randomCheck = (int) (Math.random() * 3);
            if (randomCheck == isLadder) {
                System.out.println("now it is Ladder");
                newPosition = newPosition + sc.rollDice();
            } else if (randomCheck == isSnake) {
                System.out.println("now it is snake");
                newPosition = (newPosition - sc.rollDice());
            } else {
                System.out.println(" player is no play");
            }
        System.out.println("new position is " + newPosition);
        return newPosition;
    }
    //UC4
    public int winning(int newPosition){
        Utility sc = new Utility();

        for (newPosition = 0; newPosition <= 100;){
            newPosition = sc.playerOption(newPosition);
            if (newPosition == 100) {
                System.out.println("player won the match");
            }
            else if(newPosition < 0) {
                System.out.println("now player restart from 0");
            }
            else {
                System.out.println(" player won the game ");
            }
        }
        System.out.println("player restart the game" );
        return  newPosition;
    }
}

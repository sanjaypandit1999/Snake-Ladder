package snakeladder;

/**
 * Snake ladder Game which play single player it's start position is 0
 *
 * @author Sanjay
 * @version 1.0
 * @since 10-08-2021
 */
public class Snakeladderuc2 {
    public static void main(String[] args) {
        System.out.println("Welconme to Snake-Ladder Game");
        System.out.println("Paly Single Player");
        //declare int variable
        int startPosition = 0;
        System.out.println("Player start position is " + startPosition);
        //Rolls the die get a number 1 to 6
        int dieCheck = 1 + (int)(Math.random() * ((6 -1) + 1));
        System.out.println("Player rolls the die and the number is - " +dieCheck);
    }
}

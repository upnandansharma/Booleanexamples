import java.util.Random;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        int computerThoughtNumber = rm.nextInt(50);
        System.out.println("Let's play the guessing game");
        boolean continueGame = true;
        System.out.println("Guess a Number");
        while (true) {
            int userInput = sc.nextInt();
            if (userInput == computerThoughtNumber) {
                System.out.println("You win");
                break;
            } else {
                System.out.println("wrong input try again");
                if (userInput < computerThoughtNumber) {
                    System.out.println("guess a bigger number");

                } else {
                    System.out.println("guess a lower number");
                }
            }
        }


    }
}

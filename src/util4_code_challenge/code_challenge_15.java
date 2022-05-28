package util4_code_challenge;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class code_challenge_15 {
    public static void main(String[] args){
        int randomNum = ThreadLocalRandom.current().nextInt(1, 101);
        Scanner scanner = new Scanner(System.in);
        int guessCount = 1;
        int userGuess;

        System.out.println("Try to guess a number between 1 to 100 : ");
        userGuess = scanner.nextInt();

        while( randomNum != userGuess){
            if(randomNum > userGuess){
                System.out.println("Guess Higher");
            }else{
                System.out.println("Guess Lower");
            }
            guessCount++;
            System.out.println("Try to guess a number between 1 to 100 again : ");
            userGuess = scanner.nextInt();
        }
        System.out.println("CORRECT");
        System.out.format("You've tried to guess the number %d times", guessCount);
    }
}

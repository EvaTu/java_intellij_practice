package unit3_code_challenge;
import java.util.Random;
import java.util.Scanner;

public class eighth_code_challenge {
    public static void main(String[] args){
        Random ranNum = new Random();
        Scanner userInput = new Scanner(System.in);
        int upperbound = 6;

        int int_ran = ranNum.nextInt(upperbound);
        System.out.println("Please guess a number between 0 and 5 : ");
        int userGuess = userInput.nextInt();

        if( userGuess == int_ran){
            System.out.println("Correct! Aren't you lucky.");
        }else{
            System.out.println("Hard luck! Maybe next time.");
            System.out.format("The random number is %d", int_ran);
        }

    }
}

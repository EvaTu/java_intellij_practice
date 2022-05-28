package util4_code_challenge;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class code_challenge_14 {
    public static void main(String[] args){
        int randomNum = ThreadLocalRandom.current().nextInt(1,101);
        Scanner scanner = new Scanner(System.in);
        int inputNum;

        do{
            System.out.println("Try to guess a number between 1 to 100 :");
//            System.out.println(randomNum);
            inputNum = scanner.nextInt();
            if( inputNum < randomNum){
                System.out.println("Guess Higher");
            }else if(inputNum > randomNum){
                System.out.println("Guess Lower");
            }
        }while(inputNum != randomNum);

        System.out.println("CORRECT");
    }
}

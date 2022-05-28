package util4_code_challenge;
import java.util.Scanner;
public class code_challenge_12 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String userInput;

//        do{
//            System.out.println("Enter your password: ");
//            userInput = scanner.nextLine();
//            if(userInput.equals("shark50")){
//                System.out.println("ACCESS APPROVED");
//            }
//        }while(!userInput.equals("shark50"));

        do{
           System.out.println("Enter your password: ");
           userInput = scanner.nextLine();
        }while(!userInput.equals("shark50"));

        System.out.println("ACCESS APPROVED");
    }
}

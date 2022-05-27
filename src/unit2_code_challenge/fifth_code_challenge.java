package unit2_code_challenge;
import java.util.Scanner;

//public class fifth_code_challenge {
//    public static void main(String[] args){
//        Scanner data = new Scanner(System.in);
//
//        System.out.print("First Name:");
//        String firstName = data.next();
//
//        System.out.print("Age:" );
//        int age = data.nextInt();
//
//        System.out.print("Amount of money in your pocket: $");
//        double money = data.nextDouble();
//
//        System.out.println();
//
//        double moneyNeeded = Math.ceil(money) - money;
//
//
//    }
//}


public class fifth_code_challenge {

    public static void main( String[] args){
        Scanner userData = new Scanner(System.in);

        System.out.println("What's your name");
        String name = userData.nextLine();

        System.out.println("How old are you?");
        int age = userData.nextInt();

        int doubleAge = age*2;
        int nameLength = name.length();

        System.out.format("You've lived %d years. In another %d years you'll be %d years old.", age, age, doubleAge);
        System.out.format("\nYour name is %d characters long.", nameLength);
    }

}
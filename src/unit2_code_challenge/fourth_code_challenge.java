package unit2_code_challenge;
import java.util.Scanner;

public class fourth_code_challenge {

    public static void main(String[] args){
        Scanner data = new Scanner(System.in);

        System.out.println("How much is the amount of bill total?");
        double bill = data.nextDouble();

        System.out.println("How many people are coming to the party?");
        int people = data.nextInt();

        double divided = bill/ people;

        System.out.format("There are %d people and meal costs $%.2f dollars. Each needs to pay $%.2f.", people, bill, divided);
    }
}

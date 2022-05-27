package unit1_fundamental;

import java.util.Scanner;

public class UsreInput1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something here: ");
        String input = sc.nextLine();
        System.out.printf("You enter %s", input);
    }
}

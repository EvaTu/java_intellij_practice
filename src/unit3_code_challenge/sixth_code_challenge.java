package unit3_code_challenge;
import java.util.Scanner;

public class sixth_code_challenge {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number as X: ");
        int x = input.nextInt();

        System.out.println("Enter a number as Y: ");
        int y = input.nextInt();

        if( x > y){
            System.out.format("%d is greater than %d", x, y);
        }else if( y > x){
            System.out.format("%d is greater than %d", y, x);
        }else{
            System.out.format("%d and %d are the same", y, x);
        }
    }
}

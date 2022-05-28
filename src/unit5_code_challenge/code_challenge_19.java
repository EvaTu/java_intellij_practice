package unit5_code_challenge;
import java.util.Scanner;
public class code_challenge_19 {

    public static void main(String[] args){
        String[] favFoods = new String[5];
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        String food;
        do{
        System.out.println("Enter your top 5 favorite foods: ");
        food = scanner.nextLine();
        favFoods[i] = food;
        i++;
        }while(i<3);
        System.out.println("No more memory available.");

        System.out.println("Your favourite foods are: ");
        for(int j =0 ; j < 3; j++){
            System.out.println(favFoods[j]);
        }
    }
}

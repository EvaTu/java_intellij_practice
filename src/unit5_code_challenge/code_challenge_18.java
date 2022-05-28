package unit5_code_challenge;

public class code_challenge_18 {

    public static void main(String[] args){
        double[] doubleArr = { 23.1, 45.0, 33.8, 61.8, 30.1};

        double total = 0.0;
        for(int i = 0; i < doubleArr.length; i++){
            total += doubleArr[i];
        }
        double average = total/doubleArr.length;

        System.out.println("Total of the arrray is: " + total);
        System.out.println("The average of the array is: " + average);
    }
}

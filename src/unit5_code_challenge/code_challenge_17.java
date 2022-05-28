package unit5_code_challenge;

public class code_challenge_17 {

    public static void main(String[] args){

        int[] intArr = new int[21];

        for(int i = 1; i < intArr.length; i++){
            intArr[i] = i;
        }

        for(int j = intArr.length - 1; j >= 1; j--){
            System.out.println(intArr[j]);
        }
    }
}

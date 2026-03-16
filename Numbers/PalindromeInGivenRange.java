package Numbers;

import java.util.ArrayList;
import java.util.List;

public class PalindromeInGivenRange {

    public static boolean palindromeCheck(int num){
        int originalNum = num;
        int reverse = 0;

        while(num != 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        return reverse == originalNum;
    }

    public static void main(String[] args) {

        int min = 10;
        int max = 50;

        List<Integer> list = new ArrayList<>();

        for(int i = min; i <= max; i++){

            if(palindromeCheck(i)){
                list.add(i);
            }
        }

        System.out.println(list);
    }
}
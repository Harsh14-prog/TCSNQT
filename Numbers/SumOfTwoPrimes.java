package Numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfTwoPrimes {
    public static boolean isPrime(int n){

        if(n <= 1) return false ;

        for(int i = 2 ; i * i <= n ; i++){
            if(n % i == 0){
                return false ;
            }
        }
        return true ;
    }
    public static void main(String[] args) {
        int n = 21 ;
        List <List<Integer>> list = new ArrayList<>() ;

        boolean found = false ;

        for(int i = 2 ; i <= n / 2 ; i++){
            if(isPrime(i) && isPrime(n-i)){
                list.add(Arrays.asList(i , n-i));
                found = true ;
            }
        }
        
        if(!found){
            System.out.println("not such combinations exists");
        }
        else{
            System.out.println(list);
        }
    }
}

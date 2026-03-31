package Numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Factors {
    public static void main(String[] args) {
        int n = 36 ;

        List <Integer> list = new ArrayList<>();

        for(int i = 1 ; i <= Math.sqrt(n) ; i++){

            if(n % i == 0){
                int second = n / i ;
                list.add(i); 
                if(second != i) list.add(second);
            }
        }

        Collections.sort(list);

        System.out.println(list);
    }
}

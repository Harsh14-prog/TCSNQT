package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBasket {
    public static void main(String[] args) {
        int[] fruits = {1,2,3,2,2};
        int n = fruits.length ;
        
        int l = 0 ;
        int maxLen = 0 ;

        Map <Integer , Integer> mp = new HashMap<>(); 

        for(int h = 0 ; h < n ; h++){

            mp.put(fruits[h] , mp.getOrDefault(fruits[h], 0)+1);

            while(mp.size() > 2){

                mp.put(fruits[l] , mp.get(fruits[l])-1);

                if(mp.get(fruits[l]) == 0){
                    mp.remove(fruits[l]);
                }

                l++;
            }

            maxLen = Math.max(maxLen , h-l+1);
        }
        
        System.out.println(maxLen);

    }
}

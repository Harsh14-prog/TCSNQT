package String;

import java.util.HashMap;
import java.util.Map;

public class MaxOccuringChar {
    public static void main(String[] args) {
        String s = "samplestring";

        Map <Character , Integer>  mp = new HashMap<>();

        for(char ch : s.toCharArray()){
            mp.put(ch , mp.getOrDefault(ch, 0)+1);
        }

        int maxi = 0 ;
        char ch = 'a';
        for(char key : mp.keySet()){
            if(mp.get(key) >= maxi){
                maxi = mp.get(key);
                ch = key ;
            }
        }

        System.out.println(ch);
        System.out.println(maxi);

    }
}

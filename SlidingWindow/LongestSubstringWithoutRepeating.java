package SlidingWindow;

import java.util.HashMap;
import java.util.Map;


public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int n = s.length();

        int l = 0 ;
        int maxLen = 0 ;

        Map <Character , Integer> mp = new HashMap<>();

        for(int h = 0 ; h < n ; h++){
            
            char ch = s.charAt(h);

            mp.put(ch , mp.getOrDefault(ch , 0)+1);

            while(mp.size() != (h - l + 1)){
                char leftCh = s.charAt(l);
                mp.put(leftCh , mp.get(leftCh)-1);

                if(mp.get(leftCh) == 0){
                    mp.remove(leftCh);
                }
                l++;
            }

            maxLen = Math.max(maxLen , h-l+1);
        }

        System.out.println(maxLen);
    }
}

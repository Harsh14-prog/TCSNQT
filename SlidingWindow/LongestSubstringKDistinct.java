package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinct {
    public static void main(String[] args){
        String s = "aabacbebebe";
        int n = s.length();
        Map <Character , Integer> mp = new HashMap<>();
        int l = 0 ;
        int k = 3 ;
        int maxLen = 0 ;

        for(int h = 0 ; h < n ; h++){
            
            char ch = s.charAt(h);
            mp.put(ch , mp.getOrDefault(ch , 0)+1);

            while(mp.size() > k){
                char Leftch = s.charAt(l);
                mp.put(Leftch , mp.get(Leftch)-1);

                if(mp.get(Leftch) == 0){
                  mp.remove(Leftch);
                }
                l++;
            }
            
            if(mp.size() == k){
              maxLen = Math.max(maxLen , h-l+1);
            }
        }

        System.out.println(maxLen);
    }
}

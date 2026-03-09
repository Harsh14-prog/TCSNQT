package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatCharReplace {
    public static void main(String[] args) {
        String s = "AABABBA";
        int n = s.length();

        int l = 0;
        int maxFreq = 0;
        int maxLen = 0;
        int k = 1;
        Map<Character, Integer> mp = new HashMap<>();

        for (int h = 0; h < n; h++) {

            char ch = s.charAt(h);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
            maxFreq = Math.max(maxFreq, mp.get(ch));

            while (((h - l + 1) - maxFreq) > k) {
                char leftCh = s.charAt(l);
                mp.put(leftCh, mp.get(leftCh) - 1);
                l++;
            }

            maxLen = Math.max(maxLen, h - l + 1);

        }

        System.out.println(maxLen);
    }
}

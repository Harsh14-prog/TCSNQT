package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MinWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        int n = s.length();
        int required = t.length();

        int l = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        Map<Character, Integer> mp = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        for (int h = 0; h < n; h++) {
            char ch = s.charAt(h);

            if (mp.containsKey(ch)) {
                mp.put(ch, mp.get(ch) - 1);

                if (mp.get(ch) >= 0) {
                    required--;
                }
            }

            while (required == 0) {

                if (minLen > h - l + 1) {
                    minLen = h - l + 1;
                    start = l;
                }

                char leftCh = s.charAt(l);

                if (mp.containsKey(leftCh)) {

                    mp.put(leftCh, mp.get(leftCh) + 1);

                    if (mp.get(leftCh) > 0) {
                        required++;
                    }
                }

                l++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            System.out.println("");
        } else {
            System.out.println(s.substring(start, start + minLen));
        }
    }
}

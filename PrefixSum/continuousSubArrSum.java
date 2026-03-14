package PrefixSum;

import java.util.HashMap;
import java.util.Map;

public class continuousSubArrSum {
    public static void main(String[] args) {

        int[] nums = { 23, 2, 4, 6, 7 };
        int k = 6;

        int n = nums.length;

        Map<Integer, Integer> mp = new HashMap<>();
        int pSum = 0;
        int length = 0;

        for (int i = 0; i < n; i++) {
            pSum += nums[i];
            int rem = ((pSum % k) + k) % k;

            if (rem == 0) {

                length = i + 1;
                if (length >= 2) {
                    System.out.println(true);
                    return;
                }

            }

            if (mp.containsKey(rem)) {
                length = i - mp.get(rem);
                if (length >= 2) {
                    System.out.println(true);
                    return;
                }
            }

            mp.put(rem, i);
        }

        System.out.println(false);
        return;
    }
}

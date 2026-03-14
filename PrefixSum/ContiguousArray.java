package PrefixSum;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 1, 1, 1, 1, 0, 0, 0 };
        int n = nums.length;
        int zero = 0;
        int one = 0;

        int maxLength = 0;
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {

            if (nums[i] == 0) {
                zero++;
            } else {
                one++;
            }

            int diff = zero - one;

            if (diff == 0) {
                maxLength = Math.max(maxLength, i + 1);
            }

            if (mp.containsKey(diff)) {
                maxLength = Math.max(maxLength, i - mp.get(diff));
            }

            if (!mp.containsKey(diff)) {
                mp.put(diff, i);
            }
        }

        System.out.println(maxLength);
    }
}

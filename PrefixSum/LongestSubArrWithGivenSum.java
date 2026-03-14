package PrefixSum;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrWithGivenSum {
    public static void main(String[] args) {
        int[] nums = { 3, 4, 7, 2, -3, 1, 4, 2 };
        int n = nums.length;

        int maxLen = 0;
        int sum = 0;
        int k = 7;

        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {

            sum += nums[i];

            if (sum == k) {
               maxLen = Math.max(maxLen , i+1);
            }

            if (mp.containsKey(sum - k)) {
                maxLen = Math.max(maxLen , i - mp.get(sum-k));
            }

            if(!mp.containsKey(sum)){
                mp.put(sum , i);
            }
        }
        System.out.println(maxLen);
    }
}

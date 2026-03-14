package PrefixSum;

import java.util.HashMap;
import java.util.Map;

public class SubArrSumsDivByK {
    public static void main(String[] args) {
        int[] nums = {4,-5,0,-2,-3,1};
        int n = nums.length;
        int k = 5 ;
        int count = 0 ;
        int prefixSum = 0 ;

        Map <Integer , Integer> mp = new HashMap<>();
        
        for(int i = 0 ; i < n ; i++){
           prefixSum += nums[i];
           int rem = ((prefixSum % k) + k) % k ;

           if(rem == 0) {
             count++;
           }

           if(mp.containsKey(rem)){
             count += mp.get(rem);
           }

           mp.put(rem , mp.getOrDefault(rem,0)+1);
        }

        System.out.println(count);
    }
}

package SlidingWindow;

public class ShortestSubarraySum {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int n = nums.length ;
        int k = 7 ;

        int l = 0 ;
        int sum = 0 ;
        int minLen = Integer.MAX_VALUE ;

        for(int h = 0 ; h < n ; h++){
            sum += nums[h];

            while(sum >= k){
                minLen = Math.min(minLen, h-l+1);
                sum -= nums[l];
                l++;
            }
        }

        System.out.println(minLen);
    }
}

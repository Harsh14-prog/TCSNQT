package SlidingWindow;

public class LongestSubarraySum {
    public static void main(String[] args){
       int[] nums = {2,1,5,1,3,2};
       int n = nums.length ;
       int k = 7 ;

       int l = 0 ;
       int sum = 0 ;
       int maxLength = 0 ;

       for(int h = 0 ; h < n ; h++){
         sum += nums[h];

         while(sum > k){
            sum -= nums[l];
            l++;
         }

         maxLength = Math.max(maxLength , h-l+1);
       }

       System.out.println(maxLength);
    }
}

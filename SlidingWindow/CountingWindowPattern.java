package SlidingWindow;


// solving count subarray of sum = k question with sliding window pattern (for +ve numbers only)

public class CountingWindowPattern {

    public static int atMost(int[] nums , int k){
       
        int l = 0 ;
        int sum = 0 ;
        int n = nums.length;
        int count = 0 ;

        for(int h = 0 ; h < n ; h++){
           
            sum += nums[h];

            while(sum > k){
                sum -= nums[l];
                l++;
            }

            count += h-l+1 ;
        }

        return count ;
    }
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,3};
        int k = 6 ;

        System.out.println(atMost(nums , k) - atMost(nums , k-1));
    }
}

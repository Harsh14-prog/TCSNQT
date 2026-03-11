package Kadanes;

public class MaxSumSubArrWithoneDlt {
    public static void main(String[] args) {
        int[] nums = {1,-2,0,3};
        int n = nums.length;

        int oneDelete = 0 ;
        int noDelete = nums[0] ;
        int maxSum = nums[0] ;

        for(int i = 1 ; i < n ; i++){

            oneDelete = Math.max(noDelete  , oneDelete + nums[i]);
            noDelete = Math.max(noDelete + nums[i] , nums[i]);

            maxSum = Math.max(maxSum , Math.max(oneDelete , noDelete));
        }

        System.out.println(maxSum);
    }
}

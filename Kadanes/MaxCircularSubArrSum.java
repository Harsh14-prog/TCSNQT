package Kadanes;

public class MaxCircularSubArrSum {
    public static void main(String[] args) {
        int[] nums = {5,-3,5};
        int n = nums.length;

        int maxSum = nums[0];
        int currMax = nums[0];

        int minSum = nums[0];
        int currMin = nums[0];

        int totalSum = nums[0] ;

        for(int i = 1 ; i < n ; i++){
            currMax = Math.max(nums[i] , currMax + nums[i]);
            currMin = Math.min(nums[i] , nums[i] + currMin);

            maxSum = Math.max(maxSum , currMax);
            minSum = Math.min(minSum , currMin);

            totalSum += nums[i];
        }

        if(maxSum < 0){
            System.out.println(maxSum);
            return ;
        }

        System.out.println(Math.max(maxSum , (totalSum - minSum)));
    }
}

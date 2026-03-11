package Kadanes;

public class MaxAbsSumSubArr {
    public static void main(String[] args) {

        int[] nums = {2,-5,1,-4,3,-2};
        int n = nums.length;

        int maxEnding = nums[0];
        int minEnding = nums[0];
        int maxSum = Math.abs(nums[0]);

        for(int i = 1 ; i < n ; i++){

            maxEnding = Math.max(nums[i], maxEnding + nums[i]);

            minEnding = Math.min(nums[i], minEnding + nums[i]);

            maxSum = Math.max(maxSum,
                    Math.max(Math.abs(maxEnding), Math.abs(minEnding)));
        }

        System.out.println(maxSum);
    }
}
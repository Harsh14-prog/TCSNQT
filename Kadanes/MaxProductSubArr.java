package Kadanes;

public class MaxProductSubArr {
    public static void main(String[] args) {

        int[] nums = {2,3,-2,4};

        int maxEnding = nums[0];
        int minEnding = nums[0];
        int maxProduct = nums[0];

        for(int i = 1 ; i < nums.length ; i++){

            int temp = maxEnding;

            maxEnding = Math.max(nums[i],
                    Math.max(nums[i]*maxEnding, nums[i]*minEnding));

            minEnding = Math.min(nums[i],
                    Math.min(nums[i]*temp, nums[i]*minEnding));

            maxProduct = Math.max(maxProduct , maxEnding);
        }

        System.out.println(maxProduct);
    }
}
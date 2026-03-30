

public class MaxProductSubArr {
    public static void main(String[] args) {
        int[] nums = {1, 2, -3, 0, -4, -5};

        int maxEnd = nums[0];
        int minEnd = nums[0];
        int maxProduct = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int tempMax = maxEnd;  // store previous max

            maxEnd = Math.max(nums[i],
                    Math.max(nums[i] * maxEnd, nums[i] * minEnd));

            minEnd = Math.min(nums[i],
                    Math.min(nums[i] * tempMax, nums[i] * minEnd));

            maxProduct = Math.max(maxProduct, maxEnd);
        }

        System.out.println(maxProduct);
    }
}
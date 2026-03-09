package TwoPointer;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int n = nums.length ;
        int target = 1 ;

        Arrays.sort(nums);

        int closestSum = nums[0] + nums[1] + nums[2] ;

        for(int i = 0 ; i < n-2 ; i++){

            int l = i+1 ;
            int h = n-1 ;

            while (l < h){
                int sum = nums[i] + nums[l] + nums[h];

                if(Math.abs(target - sum) < Math.abs(target - closestSum)){
                    closestSum = sum ;
                }

                if(sum < target){
                    l++ ;
                }
                else if(sum > target){
                    h-- ;
                }
                else{
                    System.out.println(sum);
                    return ;
                }
            }
        }
        System.out.println(closestSum);
        return ;
    }
}

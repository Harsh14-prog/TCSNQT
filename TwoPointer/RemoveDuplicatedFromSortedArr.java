package TwoPointer;

import java.util.Arrays;

public class RemoveDuplicatedFromSortedArr {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,4,4};
        int n = nums.length ;

        int l = 0 ;
        int h = 1 ;

        while(h < n){
            if(nums[h] != nums[l]){
                l++;
                nums[l] = nums[h];
            }
            h++;
        }

        System.out.println(Arrays.toString(nums));
    }
}

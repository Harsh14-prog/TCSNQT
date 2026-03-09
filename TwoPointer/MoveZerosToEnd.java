package TwoPointer;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int n = nums.length ;

        int i = 0 ;
        int j = 0 ;

        while(j < n){
            if(nums[j] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp ;
                i++;
            }
            j++;
        }

        System.out.println(Arrays.toString(nums));
    }
}

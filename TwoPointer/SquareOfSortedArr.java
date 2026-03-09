package TwoPointer;

import java.util.Arrays;

public class SquareOfSortedArr {
    public static void main(String[] args){
        int[] nums = {-7,-3,2,3,11};
        int n = nums.length ;

        int[] result = new int[n];
        int l = 0 ;
        int h = n-1 ;
        int idx = n-1 ;

        while(l <= h){

            if(nums[l] * nums[l] > nums[h] * nums[h]){
               result[idx] = nums[l] * nums[l] ;
               l++ ;
            }
            else{
                result[idx] = nums[h] * nums[h] ;
                h-- ;
            }
            idx-- ;
        }

        System.out.println(Arrays.toString(result));
    }
}

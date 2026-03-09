package TwoPointer;

import java.util.Arrays;

public class RemoveDupliFromSortedArray_Two {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int n = nums.length ;

         int slow = 2 ;   // bez 1st 2 positions are okk always
         int fast = 2 ;

         // maintain slow pointer at invalid position i.e 3rd duplicate position
         // maintain fast pointer at another unique ele in order to swap with invalid slow pointer
         // position

         while(fast < n){

            if(nums[slow-2] != nums[fast]){
                nums[slow] = nums[fast];
                slow++;
            }   
            fast++;
         }

        System.out.println(Arrays.toString(nums));
    }
}

package TwoPointer;

import java.util.Arrays;

public class TripletWithSmallerSum {
    public static void main(String[] args) {

        int[] nums = {1,3,4,5,7};

        Arrays.sort(nums);

        int target = 12 ;
        int n = nums.length ;
        int count = 0 ;

        for(int i = 0 ; i < n-2 ; i++){
            int l = i+1 ;
            int h = n-1 ;

            while(l < h){
                int sum = nums[i] + nums[l] + nums[h];

                if(sum < target){
                    count  += h - l ;
                    l++ ;
                }
                else{
                    h-- ;
                }
            }
        }

        System.out.println(count);
    }
}

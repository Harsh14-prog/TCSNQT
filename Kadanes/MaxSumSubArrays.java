package Kadanes;

public class MaxSumSubArrays {
    public static void main(String[] args) {

        int[] nums = {1,4,-3,6,-1};
        int n = nums.length; 
        int maxSum = nums[0];
        int bestEnding = nums[0] ;
        int start = 0 ;
        int end = 0 ;
        int tempStart = 0 ;

        for(int i = 1 ; i < n ; i++){
            int v1 = nums[i] ;
            int v2 = bestEnding + nums[i];

            if(v1 > v2){
                bestEnding = v1 ;
                tempStart = i ;
            }
            else{
                bestEnding = v2 ;
            }

            if(bestEnding > maxSum) {
                maxSum = bestEnding ;
                start = tempStart ;
                end = i ;
            }
        }

        System.out.println(maxSum);

        for(int i = start ; i <= end ; i++){
            System.out.print(nums[i] + " ");
        }
    }
}

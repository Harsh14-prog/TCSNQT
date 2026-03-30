import java.util.Arrays;

public class ArrAscAndDesOrder {
    public static void main(String[] args) {
        int[] nums = {4 ,2 ,8 ,6 ,15 ,5 ,9 ,20};
        int n = nums.length ;

        Arrays.sort(nums);

        int l = (n+1)/2 ;
        int h = n-1 ;

        while(l < h){
            int temp = nums[l];
            nums[l] = nums[h];
            nums[h] = temp ;

            l++;
            h--;
        }

        for(int i : nums){
            System.out.println(i);
        }
    }
}
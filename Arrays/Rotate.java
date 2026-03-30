

public class Rotate {

    public static void reverse(int[] arr, int l, int r) {

        while(l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }
    }
   public static void main(String[] args) {
      int[] nums = {1,2,3,4,5,6,7};
      int k = 3 ;  // right rotate
      int n = nums.length ;

      reverse(nums , 0 , n-1);
      reverse(nums , 0 , k-1);
      reverse(nums , k , n-1);

      System.out.println(nums);
   } 
}

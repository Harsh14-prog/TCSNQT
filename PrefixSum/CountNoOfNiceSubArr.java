package PrefixSum;

// import java.util.HashMap;
// import java.util.Map;


// for add number added 1 in sum and for even no added 0 , sum = 4 means till this index
// 4 1's (odd's) are there  but we want odd's = k = 3  i.e sum = 3
// question got convrted into count subarr with sum = k

// see down sliding window approch


// prefixSum + HashMap approch -- >>>>>>>>>

// public class CountNoOfNiceSubArr {
//     public static void main(String[] args) {
//         int[] nums = {1,1,2,1,1};
//         int n = nums.length ;
//         int k = 3 ;
//         int pSum = 0 ;
//         int count = 0 ;

//         Map <Integer , Integer> mp = new HashMap<>();

//         for(int i = 0 ; i < n ; i++){
            
//             if(nums[i] % 2 != 0){
//                 pSum += 1 ;
//             }

//             if(pSum == k){
//                 count++ ;
//             }

//             if(mp.containsKey(pSum - k)){
//                 count += mp.get(pSum - k);
//             }

//             mp.put(pSum , mp.getOrDefault(pSum , 0)+1);
//         }

//         System.out.println(count);
//     }
// }


public class CountNoOfNiceSubArr {

    public static int atMost(int[] nums , int k){
      
        int n = nums.length ;
        int l = 0 ;
        int count = 0 ;
        int oddCount = 0 ;

        for(int h = 0 ; h < n ; h++){
            if(nums[h] % 2 != 0){
                oddCount++;
            }

            while(oddCount > k){
                if(nums[l] % 2 != 0){
                    oddCount--;
                }
                l++;
            }

            count += h-l+1 ;
        }

        return count ;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,1,1};
        int k = 3 ;

        System.out.println(atMost(nums, k) - atMost(nums, k-1));
    }
}

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReplaceEleByRank {
    public static void main(String[] args) {
        int[] nums = {20, 15, 26, 2, 98, 6};
        int n = nums.length;

        Map<Integer, Integer> mp = new HashMap<>();

        int[] arr = Arrays.copyOf(nums, n);
        Arrays.sort(arr);

        int rank = 1;

        for (int ele : arr) {
            if (!mp.containsKey(ele)) {
                mp.put(ele, rank);
                rank++;
            }
        }

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = mp.get(nums[i]);
        }

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
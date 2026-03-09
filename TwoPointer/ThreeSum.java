package TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {

        int[] nums = { -2, -2, -2, -1, -1, -1, 0, 0, 0, 2, 2, 2, 2 };
        int n = nums.length;

        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int l = i + 1;
            int h = n - 1;

            while (l < h) {

                int sum = nums[l] + nums[h];
                int target = -nums[i];

                if (sum == target) {

                    list.add(Arrays.asList(nums[i], nums[l], nums[h]));
                    l++;
                    h--;

                    while (l < h && nums[l] == nums[l - 1])
                        l++;
                    while (l < h && nums[h] == nums[h + 1])
                        h--;
                }

                else if (sum < target) {
                    l++;
                }

                else {
                    h--;
                }
            }
        }

        System.out.println(list);
    }
}

package TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {

        int[] nums = { 1, 0, -1, 0, -2, 2 };
        int target = 0;

        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            for (int j = i + 1; j < n - 2; j++) {

                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                int l = j + 1;
                int h = n - 1;

                while (l < h) {

                    int sum = nums[i] + nums[j] + nums[l] + nums[h];

                    if (sum == target) {

                        list.add(Arrays.asList(nums[i], nums[j], nums[l], nums[h]));

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
        }

        System.out.println(list);
    }
}

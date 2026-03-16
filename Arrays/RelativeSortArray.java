package Arrays;

import java.util.*;

public class RelativeSortArray {

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {

        int n1 = arr1.length;

        Map<Integer, Integer> mp = new HashMap<>();
        int[] result = new int[n1];
        int idx = 0;

        // Step 1: Build frequency map
        for (int num : arr1) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        // Step 2: Place elements according to arr2
        for (int num : arr2) {
            if (mp.containsKey(num)) {

                int freq = mp.get(num);

                while (freq-- > 0) {
                    result[idx++] = num;
                }

                mp.remove(num);
            }
        }

        // Step 3: Remaining elements
        List<Integer> remaining = new ArrayList<>();

        for (int key : mp.keySet()) {

            int freq = mp.get(key);

            while (freq-- > 0) {
                remaining.add(key);
            }
        }

        Collections.sort(remaining);

        // Step 4: Add remaining elements
        for (int num : remaining) {
            result[idx++] = num;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = {2,1,2,5,7,1,9,3,6,8,8};
        int[] arr2 = {2,1,8,3};

        int[] result = relativeSortArray(arr1, arr2);

        System.out.println(Arrays.toString(result));
    }
}
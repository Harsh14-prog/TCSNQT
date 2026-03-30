import java.util.*;

public class SortByFreq {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2,4,3,1,2};

        Map<Integer, Integer> mp = new HashMap<>();

        for(int ele : nums){
            mp.put(ele , mp.getOrDefault(ele , 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for(int ele : nums){
            list.add(ele);
        }

        Collections.sort(list , (a,b) -> {

            int fa = mp.get(a);
            int fb = mp.get(b);

            // Case 1: Higher frequency first
            if (fa != fb) {
                return fb - fa;   // freq compare bez we want greater freq first
            }

            // Case 2: Same frequency → smaller number first
            return a - b;
        });

        System.out.println(list);
    }
}
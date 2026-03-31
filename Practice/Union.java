package Practice;

import java.util.ArrayList;
import java.util.List;

public class Union {
    public static void main(String[] args) {
        int[] a1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] a2 = { 2, 3, 4, 4, 5, 11, 12 };

        int n1 = a1.length;
        int n2 = a2.length;

        int l = 0;
        int h = 0;

        List<Integer> list = new ArrayList<>();

        while (l < n1 && h < n2) {

            if (a1[l] < a2[h]) {

                if (list.isEmpty() || list.get(list.size() - 1) != a1[l]) {
                    list.add(a1[l]);
                }
                l++;
            } 
            else if (a1[l] == a2[h]) {
                list.add(a1[l]);
                l++;
                h++;
            } 
            else {
                if (list.isEmpty() || list.get(list.size() - 1) != a2[h]) {
                    list.add(a2[h]);
                }
                h++;
            }
        }

        while (l < n1) {
            if (list.isEmpty() || list.get(list.size() - 1) != a1[l]) {
                list.add(a1[l]);
            }
            l++;
        }

        while (h < n2) {
            if (list.isEmpty() || list.get(list.size() - 1) != a2[h]) {
                list.add(a2[h]);
            }
            h++;
        }

        System.out.println(list);
    }
}

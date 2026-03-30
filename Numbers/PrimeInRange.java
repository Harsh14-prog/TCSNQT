package Numbers;

import java.util.ArrayList;
import java.util.List;

public class PrimeInRange {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 50;
        boolean[] isPrime = new boolean[b + 1];

        for (int i = 2; i <= b; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= b; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= b; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> list = new ArrayList<>();

        for (int i = a; i <= b; i++) {   
            if (isPrime[i]) {
                list.add(i);
            }
        }

        System.out.println(list);
    }
}
package Numbers;

import java.util.Scanner;

public class SumOfGp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double r = sc.nextDouble();
        int n = sc.nextInt();

        sc.close();

        if(r == 1){
            System.out.println(n * r);
            return ;
        }

        System.out.println(a * (Math.pow(r, n) - 1) / (r-1));
    }
}

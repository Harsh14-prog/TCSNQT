package Numbers;

public class Factorial {
    public static void main(String[] args) {
        int n = 5 ;
        int fact = 1 ; 

        if(n == 0) {
            System.out.println(1);
            return ;
        }
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }

        System.out.println(fact);
    }
}

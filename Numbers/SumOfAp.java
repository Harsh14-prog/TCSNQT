package Numbers;

public class SumOfAp {
    public static void main(String[] args) {
        double a = 1 ; 
        double d = 3 ;
        int n = 7 ;

        double sum = (n / 2.0) * (2 * a + (n-1)*d);
        System.out.println(sum);
    }
}

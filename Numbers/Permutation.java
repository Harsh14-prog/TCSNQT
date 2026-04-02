package Numbers;

public class Permutation {
    public static void main(String[] args) {
        int n = 5 ;
        int r = 3 ;

        int result = 1 ;

        for(int i = 0 ; i < r ; i++){
            result *= (n - i) ;
        }

        System.out.println(result);
    }
}

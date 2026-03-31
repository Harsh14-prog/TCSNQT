package Numbers;

public class Automorphic {
    public static void main(String[] args) {
        int n = 76 ;

        int square = n * n ;
        int temp = n ;

        int factor = 1 ;

        while(temp != 0){
            temp /= 10 ;
            factor *= 10 ;
        }

        if ((square % factor) == n){
            System.out.println("automorphic");
        }
        else{
            System.out.println("not automorphic");
        }    
    }
}

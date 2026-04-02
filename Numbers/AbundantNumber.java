package Numbers;

public class AbundantNumber {
    public static void main(String[] args) {
        int n = 18 ;
        int sum = 0 ;

        for(int i = 1 ; i <= Math.sqrt(n) ; i++){
            if(n % i == 0){
               sum += i ;
               if(n / i != i && n / i != n){
                sum += n/i ;
               }
            }
        }

        if(sum > n){
            System.out.println("Abundant");
        }
        else{
            System.out.println("Not a Abundant");
        }
    }
}

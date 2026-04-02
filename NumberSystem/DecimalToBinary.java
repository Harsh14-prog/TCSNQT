package NumberSystem;

public class DecimalToBinary {
    public static void main(String[] args) {
        int num = 325 ;
        int Binary = 0 ;
        int place = 1 ;

        while(num != 0){
           int remainder = num % 2 ;
           Binary += remainder * place ;
           place *= 10 ;
           num /= 2 ;
        }

        System.out.println(Binary);
    }
}

package NumberSystem;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int num = 1111 ;

        int power = 1 ;
        int result = 0 ;

        while (num != 0){
          int digit = num % 10 ;
          result += digit * power ;
          num /= 10 ;
          power *= 2 ;
        }
        
        System.out.println(result);

    }
}

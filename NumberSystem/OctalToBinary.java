package NumberSystem;

public class OctalToBinary {

    public static int octaltoDecimal(int n){

        int power = 1 ;
        int result = 0 ;

        while (n != 0){
            int digit = n % 10 ;
            result += digit * power ;
            power *= 8 ;
            n /= 10 ;
        }

        return result ;
    }

    public static String decimaltoBinary(int n){
       String result = "";

        while(n != 0){
          result = (n % 2) + result;
          n /= 2;
         }

     return result;
    }
    public static void main(String[] args) {
        int octal = 345 ;
        int decimal = octaltoDecimal(octal);
        String binary = decimaltoBinary(decimal);

        System.out.println(binary);
    }
}

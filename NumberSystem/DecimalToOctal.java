package NumberSystem;

public class DecimalToOctal {
    public static void main(String[] args) {
        int decimal = 325 ;
        int octal = 0 ;
        int place = 1 ;

        while (decimal != 0){
            int remainder = decimal % 8 ;
            octal += remainder * place ;
            place *= 10 ;
            decimal /= 8 ;
        }

        System.out.println(octal);
    }
}

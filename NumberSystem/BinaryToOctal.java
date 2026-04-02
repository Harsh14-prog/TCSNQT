package NumberSystem;

public class BinaryToOctal {
    public static void main(String[] args) {
        int binary = 11010101 ;
        int octal = 0 ;
        int place = 1 ;

        while(binary != 0){

            int group = 0 ;
            int power = 1 ;

            for(int i = 0 ; i < 3 && binary != 0 ; i++){
                int digit = binary % 10 ;

                group += digit * power ;
                binary /= 10 ;
                power *= 2 ;
            }

            octal += group * place ;
            place *= 10 ;
        }

        System.out.println(octal);
    }
}

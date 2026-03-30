package Numbers;

public class Reverse {
    public static void main(String[] args) {
        int num = 123456 ;
        int result = 0 ;

        while(num != 0){
            result = result * 10 + num % 10 ;
            num /= 10 ;
        }

        System.out.println(result);
    }
}

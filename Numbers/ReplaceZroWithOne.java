package Numbers;

public class ReplaceZroWithOne {
    public static void main(String[] args) {
        int num = 102003 ;

        int result = 0 ;

        while (num != 0){
           int digit = num % 10 ;

           if(digit == 0) digit = 1 ;

           result = result * 10 + digit ;

           num /= 10 ;
        }
        
        int ans = 0 ;

        while (result != 0){
            ans = ans * 10 + result % 10 ;
            result /= 10 ;
        }

        System.out.println(ans);
    }
}

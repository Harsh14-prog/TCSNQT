package Numbers;

public class ArmStrong {

    public static int calculate(int digit , int n){
        int power = 1 ;
        for(int i = 0 ; i < n ; i++){
           power = power * digit ;
        }

        return power ;
    }
    public static void main(String[] args) {
        int n = 371 ;
        int sum = 0 ;
        int tempNum = n ;
        int length = 0 ;

        while(tempNum != 0){
            tempNum /= 10 ;
            length++;
        }

        tempNum = n ;

        while(tempNum != 0){
            int digit = tempNum % 10 ;
            int power = calculate(digit ,length);
            sum += power ;
            tempNum /= 10 ;
        } 

        if (sum == n){
            System.out.println(true);
            return ;
        }
        else{
            System.out.println(false);
        }

    }
}

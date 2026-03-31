package Numbers;

public class Strong {

    public static void main(String[] args) {

        int n = 145 ;
        int sum = 0 ;
        int temp = n ;

        int[] fact = new int[10];
        fact[0] = 1 ;

        for(int i = 1 ; i < 10 ; i++){
            fact[i] = fact[i-1] * i ;
        }

        while(temp != 0){
            int digit = temp % 10 ;
            sum = sum + fact[digit];
            temp = temp / 10 ;
        }

        if(sum == n){
            System.out.println("Strong");
        }
        else{
            System.out.println("Not a strong");
        }
    }
}

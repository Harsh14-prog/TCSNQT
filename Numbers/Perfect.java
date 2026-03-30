package Numbers;

public class Perfect {
    public static void main(String[] args) {
        int n = 28 ;
        int sum = 0 ;

        for(int i = 1 ; i * i <= n ; i++){
            if(n % i == 0){
                
                if(i != n) {
                    sum += i ;
                }
                
                int other = n / i ;
                if(other != i && other != n){
                   sum += other ;
                }
            }
        }

        if(sum == n){
            System.out.println(true);
            return ;
        }
        else{
            System.out.println(false);
        }
    }
}

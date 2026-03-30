package Numbers;

public class Prime {
    public static void main(String[] args) {
        int n = 97 ;

        for(int i = 2 ; i < Math.sqrt(n) ; i++){
            if(n % i == 0){
                System.out.println(false);
                return ;
            }
        }
        System.out.println(true);
    }
}

package Numbers;


// public class Fibonacci {
//     public static void main(String[] args) {
        
//         int n = 5 ;

//         int[] fib = new int[n+1];

//         fib[0] = 0 ;
//         fib[1] = 1 ;

//         for(int i = 2 ; i <= n ; i++){
//             fib[i] = fib[i-1] + fib[i-2];
//         }

//         System.out.println(Arrays.toString(fib));
//     }
// }

// public class Fibonacci {

//     public static int fib(int n){
//         if(n == 0) return 0 ;
//         if(n == 1) return 1 ;

//         return fib(n-1) + fib(n-2);
//     }
//     public static void main(String[] args) {
        
//         int n = 13 ;

//         System.out.println(fib(n));

//     }
// }

public class Fibonacci {
    public static void main(String[] args) {

        int n = 13;

        int a = 0, b = 1;

        for(int i = 2; i <= n; i++){
            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println(n == 0 ? a : b);
    }
}

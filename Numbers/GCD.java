package Numbers;

public class GCD {
    public static void main(String[] args) {

        int a = 12;
        int b = 18;

        int x = a; // store original
        int y = b;

        while (b != 0){
            int temp = a;
            a = b;
            b = temp % b;
        }

        int gcd = a;

        System.out.println("GCD = " + gcd);

        int lcm = (x * y) / gcd;

        System.out.println("LCM = " + lcm);
    }
}
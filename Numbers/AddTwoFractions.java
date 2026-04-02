package Numbers;

public class AddTwoFractions {

    public static int gcd(int a , int b){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int n1 = 3; 
        int d1 = 4; 
        int n2 = 1; 
        int d2 = 7;

        int numerator = (n1 * d2) + (n2 * d1);
        int denominator = (d1 * d2);

        int g = gcd(numerator, denominator); // store once

        numerator /= g;
        denominator /= g;

        System.out.println(numerator + "/" + denominator);
    }
}
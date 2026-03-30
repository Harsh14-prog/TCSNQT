package String;

public class SumOfDigitInString {
    public static void main(String[] args) {
        String s = "12a34";
        int n = s.length();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (Character.isDigit(s.charAt(i))) {
                int num = 0;

                while (i < n && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }

                sum += num;
                i--; // VERY IMPORTANT
            }
        }

        System.out.println(sum);
    }
}

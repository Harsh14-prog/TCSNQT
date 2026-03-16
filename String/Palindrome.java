package String;

public class Palindrome {

    boolean isPalindrome(String s) {

        int n = s.length();
        StringBuilder sb = new StringBuilder();

        for (int i = n - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }

        String st = sb.toString();

        if (s.equals(st)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        String s = "madam";

        Palindrome obj = new Palindrome();

        if (obj.isPalindrome(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

}
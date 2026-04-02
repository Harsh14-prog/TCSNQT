package NumberSystem;

public class ConvertNumbersToWords {
    public static void main(String[] args) {

        String str = "1208";

        // Words for single digits
        String[] singleDigit = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        // Words for numbers from 10 to 19
        String[] twoDigits = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen" };

        // Words for multiples of ten from 20 onwards
        String[] tensMultiple = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
                "ninety" };

        // Words for higher powers
        String[] tensPower = { "hundred", "thousand" };

        // Handle empty input
        if (str.length() == 0) {
            System.out.println("");
            return;
        }

        if (str.length() == 1) {
            System.out.print(singleDigit[str.charAt(0) - '0']);
            return;
        }

        // Store length of string
        int len = str.length();

        // Loop through each digit
        for (int i = 0; i < str.length(); i++) {
            if (len > 2) {
                if (str.charAt(i) - '0' != 0) {
                    System.out.print(singleDigit[str.charAt(i) - '0'] + " ");
                    System.out.print(tensPower[len - 3] + " ");
                }
                len--;
            } else {
                
                int digit = str.charAt(i) - '0';

                // CASE 1: 10–19
                if (digit == 1) {
                    if (i + 1 < str.length()) {
                        System.out.print(twoDigits[str.charAt(i + 1) - '0'] + " ");
                    }
                    return;
                }

                // CASE 2: tens place (20–90)
                if (digit > 1) {
                    System.out.print(tensMultiple[digit] + " ");

                    if (i + 1 < str.length() && str.charAt(i + 1) - '0' != 0) {
                        System.out.print(singleDigit[str.charAt(i + 1) - '0'] + " ");
                    }
                    return;
                }

                // CASE 3: tens digit is 0 → handle ones directly
                if (digit == 0) {
                    if (i + 1 < str.length()) {
                        int nextDigit = str.charAt(i + 1) - '0';
                        if (nextDigit != 0) {
                            System.out.print(singleDigit[nextDigit] + " ");
                        }
                    }
                    return;
                }
            }
        }
    }
}

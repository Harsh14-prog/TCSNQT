package String;

public class changeLetterToNextLexicographicLetter {
    public static void main(String[] args) {
        String s = "abcdxyz";
        int n = s.length();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == 'Z') {
                sb.append('A');
            } 
            else if (ch == 'z') 
            {
                sb.append('a');
            } 
            else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                sb.append((char) (ch + 1));
            } 
            else {
                sb.append(ch);
            }
        }

        System.out.println(sb.toString());
    }
}

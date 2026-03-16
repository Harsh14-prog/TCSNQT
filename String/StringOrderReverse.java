package String;

public class StringOrderReverse {

    public static void main(String[] args) {

        String s = "welcome to the jungle";

        String[] words = s.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--){
            sb.append(words[i]).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
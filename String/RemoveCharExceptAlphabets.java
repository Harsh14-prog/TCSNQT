package String;

public class RemoveCharExceptAlphabets {
    public static void main(String[] args) {
        String s = "take12% *&u ^$#forward";
        int n = s.length();

        s = s.toLowerCase();

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
              sb.append(ch);
            }
        }

        System.out.println(sb.toString());
    }
}

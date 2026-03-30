package String;

public class ToggleCase {
    public static void main(String[] args) {
        String s = "geeksForgEeks";
        int n = s.length();

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);

            if(ch >= 'A' && ch <= 'Z'){
                ch += 32 ;
            }
            else{
                ch -= 32 ;
            }

            sb.append(ch);
        }

        System.out.println(sb.toString());
    }
}

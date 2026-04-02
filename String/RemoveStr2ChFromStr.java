package String;

import java.util.HashSet;
import java.util.Set;

public class RemoveStr2ChFromStr {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "cefz";

        Set <Character> st = new HashSet<>();

        for(int i = 0 ; i < s2.length() ; i++){
            char ch = s2.charAt(i);
            st.add(ch);
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < s1.length() ; i++){
            char ch = s1.charAt(i);
            if(!st.contains(ch)){
                sb.append(ch);
            }
        }

        System.out.println(sb.toString());
    }
}

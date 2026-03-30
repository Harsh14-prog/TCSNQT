package String;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s = "bcdabc";
        int n = s.length();

        StringBuilder sb = new StringBuilder();
        boolean[] seen = new boolean[26];

        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            if(!seen[ch - 'a']){
                seen[ch - 'a'] = true ;
                sb.append(ch);
            }

        }

        System.out.println(sb.toString());
    }
}

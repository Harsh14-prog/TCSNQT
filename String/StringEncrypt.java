package String;

public class StringEncrypt {

    public static void main(String[] args) {

        String s = "aaabbc";
        int n = s.length();

        int count = 1;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){

            if(i < n-1 && s.charAt(i) == s.charAt(i+1)){
                count++;
            }
            else{
                sb.append(s.charAt(i)).append(count);
                count = 1;
            }
        }

        System.out.println(sb.reverse().toString());
    }
}
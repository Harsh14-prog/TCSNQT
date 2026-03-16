package String;

public class RemoveVowel {

        public static String removeVowels(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        
        s = s.toLowerCase();
        
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
                sb.append(ch);
            }
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        
        String s = "Beautiful Day";
        
        String result = removeVowels(s);

        System.out.println(result);
    }
}
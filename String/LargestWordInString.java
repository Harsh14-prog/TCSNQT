package String;

public class LargestWordInString {
    public static void main(String[] args) {
        String s = "Google Doc";

        String[] arr = s.split(" ");
        int maxLen = arr[0].length() ;
        String word = arr[0];

        for(String st : arr){
           if(st.length() > maxLen){
            maxLen = st.length();
            word = st ;
           }
        }

        System.out.println(word);
    }
}

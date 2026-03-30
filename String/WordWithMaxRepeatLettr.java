package String;

public class WordWithMaxRepeatLettr {
    public static void main(String[] args) {
        String words = "hello apple banana";

        int maxFreq = 0 ;

        String[] word = words.split(" ");

        String result = word[0];

        for(String s : word){
           char[] chArr = s.toCharArray();

           int[] freq = new int[26];

           int currMax = 0 ;

           for(char ch : chArr){
            freq[ch - 'a']++;
           }

           for(int i = 0 ; i < chArr.length ; i++){
              char ch = chArr[i];

              if(freq[ch-'a'] > currMax){
                currMax = freq[ch-'a'];
              }
           }

           if(currMax > maxFreq){  // check curr word chi freq overall arr madhlya kontya word peksha jast aahe ka te
            maxFreq = currMax ;
            result = s ;
           }
        }

        System.out.println(maxFreq);
        System.out.println(result);
    }
}

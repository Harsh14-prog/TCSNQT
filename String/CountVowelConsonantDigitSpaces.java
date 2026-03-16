package String;

public class CountVowelConsonantDigitSpaces {

    public static void main(String[] args) {

        String s = "Take u forward is Awesome 123";

        int vowel = 0;
        int consonant = 0;
        int digits = 0;
        int spaces = 0;

        s = s.toLowerCase();

        for(int i = 0; i < s.length(); i++){

            char ch = s.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowel++;
            }
            else if(ch >= 'a' && ch <= 'z'){
                consonant++;
            }
            else if(ch >= '0' && ch <= '9'){
                digits++;
            }
            else if(ch == ' '){
                spaces++;
            }
        }

        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
    }
}
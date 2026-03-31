package Numbers;

public class NivenNumber {
    public static void main(String[] args) {
        int n = 378 ;
        String s = String.valueOf(n);

        int length = s.length();
        int sum = 0 ;
        
        for(int i = 0 ; i < length ; i++){
            sum += s.charAt(i) - '0';
        }

        if(sum != 0 && n % sum == 0){
            System.out.println("yess");
        }
        else{
            System.out.println("noo");
        }
    }
}

package String;

public class CapitalFirstndLastChar {
    public static void main(String[] args) {
        String s = "take u forward is awesome";

        String[] arr = s.split("\\s+");

        StringBuilder result = new StringBuilder();

        for(String st : arr){

            StringBuilder sb = new StringBuilder();

            for(int i = 0 ; i < st.length() ; i++){
                if(i == 0 || i == st.length() - 1){
                    sb.append(Character.toUpperCase(st.charAt(i)));
                } else {
                    sb.append(st.charAt(i));
                }
            }

            result.append(sb).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
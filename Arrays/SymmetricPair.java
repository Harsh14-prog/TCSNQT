import java.util.HashMap;
import java.util.Map;

public class SymmetricPair {
    public static void main(String[] args) {
       int[][] arr = {{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};
       Map <Integer , Integer> mp = new HashMap<>();

       for(int i = 0 ; i < arr.length ; i++){
          int first = arr[i][0];
          int second = arr[i][1];
          
          if(mp.containsKey(second) && mp.get(second) == first){
            System.out.print("(" + first + " " + second + ")");
          }
          else{
            mp.put(first , second);
          }
       }
    }
}

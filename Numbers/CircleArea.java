package Numbers;

public class CircleArea {
    public static void main(String[] args) {
        int r = 5;

        double area = Math.PI * Math.pow(r, 2);
        
        area = Math.round(area * 100.0) / 100.0;
        System.out.println(area);
    }
}

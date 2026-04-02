package Numbers;

public class SumInGivenRange {
    public static void main(String[] args) {
        int l = 2;
        int h = 7;

        int sumH = h * (h + 1) / 2;
        int sumL = (l - 1) * l / 2;

        System.out.println(sumH - sumL);
    }
}

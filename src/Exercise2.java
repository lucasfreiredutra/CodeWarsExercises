/* Your task is to write a function which
returns the sum of following series upto nth term(parameter).

Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...

*/

public class Exercise2 {

    public static void main(String[] args) {
        System.out.println(seriesSum(9));

    }

    public static String seriesSum(int n) {
        double denominator = 1;
        double numerator = 1;
        double series = 0.0d;

        for (int i = 0; i < n; i++) {
            series += (numerator / denominator);
            System.out.println(numerator + " / " + denominator );
            denominator += 3;
        }

        return String.format("%.2f", series);
    }
}

/* In this little assignment you are given a string of space separated numbers,
and have to return the highest and lowest number.*/

/* highAndLow("1 2 3 4 5")  // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5" */

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(highAndLow("1 9 3 4 -5"));
    }
    public static String highAndLow(String numbers) {
        String[] number = numbers.split(" ");
        int higher = 0;
        int lower = Integer.parseInt(number[0]);

        for (int i = 0; i < number.length; i++) {
            if (Integer.parseInt(number[i]) > higher) {
                higher = Integer.parseInt(number[i]);
            } else if (Integer.parseInt(number[i]) < lower) {
                lower = Integer.parseInt(number[i]);
            }
        }

        return higher + " " + lower;
    }

}

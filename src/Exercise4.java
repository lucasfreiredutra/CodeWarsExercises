/* Write function bmi that calculates body mass index (bmi = weight / height2).
if bmi <= 18.5 return "Underweight"

if bmi <= 25.0 return "Normal"

if bmi <= 30.0 return "Overweight"

if bmi > 30 return "Obese"
*/

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println(bmi(65, 1.65));
    }

    public static String bmi(double weight, double height) {
        if (weight / Math.pow(height, 2) <= 18.5) {
            return "Underweight";
        } else if (weight / Math.pow(height, 2) <= 25.0) {
            return "Normal";
        } else if (weight / Math.pow(height, 2) <= 30.0) {
            return "Overweight";
        } else if (weight / Math.pow(height, 2) > 30.0) {
            return "Obese";
        }
        return "";
    }
}

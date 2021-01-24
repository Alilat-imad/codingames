package codewars.test19;

// https://www.codewars.com/kata/57a429e253ba3381850000fb/train/java

public class Bmi {

    public static String calculate(double weight, double height) {
        double bmi = weight / Math.pow(height, 2);
        String output;
        if (    bmi <= 18.5 ) {
            output = "Underweight";
        }
        else if ( 18.5  < bmi && bmi <= 25.0) {
            output = "Normal";
        } else if ( 25.0  < bmi && bmi <= 30.0) {
            output = "Overweight";
        }
        else {
            output = "Obese";
        }
        return output;
    }


}

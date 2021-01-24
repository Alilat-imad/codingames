package codewars.test3;

// https://www.codewars.com/kata/5861d28f124b35723e00005e/train/java

public class WillYouMakeItFuel {

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft){
        return (mpg * fuelLeft >= distanceToPump);
    }

}

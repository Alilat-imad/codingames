package codewars.test24;

// https://www.codewars.com/kata/582cb0224e56e068d800003c

public class KeepHydrated {

    public static int Liters(double time) {

        //Your code goes here! Hint: You should change that -1
//        1H --- > 0.5 Litre
//        3H ---> ?
        return (int) (time * 0.5d);

    }

    public static void main(String[] args) {
        System.out.println("Liters(6.7) = " + Liters(6.7));
        ;
    }
}

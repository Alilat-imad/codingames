package codewars.test17;

public class IsItNbr {
    public static boolean isDigit(String s) {
        try {
            System.out.println(Double.parseDouble(s));
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}

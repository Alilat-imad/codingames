package oop.test1;

public class ExceptionPriority {

    public int division(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException arithmeticException) {
            return 0;
        } catch (RuntimeException runtimeException) {
            return -1;
        } finally {
            System.out.println("DONE");
        }
    }

    public static void main(String[] args) {
        var result = new ExceptionPriority().division(0, 0);
        System.out.println("result = " + result);
    }
}

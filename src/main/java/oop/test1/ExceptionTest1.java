package oop.test1;

public class ExceptionTest1 {

    public static void main(String[] args) {
        System.out.println("a");
        try {
            System.out.println("b");
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.println("c");
            throw new RuntimeException("1");
        } catch (RuntimeException e) {

        } finally {
            System.out.println("e");
            throw new RuntimeException("3");
        }
    }
}

package oop.test1;

public class ExceptionTest2 {
    public static void main(String[] args) {
        try {
            System.out.println("A");
            throw new RuntimeException("Out of Bounds !");
        } catch (ArrayIndexOutOfBoundsException t) {
            System.out.println("B");
            throw t;
        } finally {
            System.out.println("C");
        }
    }
}

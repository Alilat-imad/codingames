package oop.test1;

public class ExceptionTest3 {

    public void openDraw() throws Exception {
        try {
            throw new Exception("Cycle");
        } catch (Exception e) {
            System.out.println("Opening");
        } finally {
            System.out.println("Walls");
        }
    }

    public static void main(String[] args) throws Exception {
        new ExceptionTest3().openDraw();
    }
}

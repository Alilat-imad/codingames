package oop.test1;

public class Test {
    private String imad;

    public int ohNo(int input) {
        try {
            int result = 5 / input;
            return result;
        } catch (Exception e) {
            return 0;
        }
    }

    public void binding() {
        Object test = new Object();
        System.out.println("test = " + test.toString());

        String word = null;
        System.out.println("word = " + word);
        Object result = 3;
//        String output = (String) result;
//        System.out.println(output);
    }
}

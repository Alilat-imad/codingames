package oop.test1;

public class Main {

    private String text;

    public static void main(String[] args) {
        Test myClass = new Test();
        System.out.println("Value => " + myClass.ohNo(0));
        myClass.binding();
        System.out.println(5 / 0);
    }
}

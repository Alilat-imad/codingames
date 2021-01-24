package oop.test1;

public class Cat {

    private String name;

    public void parseName() {
        System.out.println("1");
        try {
            System.out.println("2");
            int result = Integer.parseInt(name);
            System.out.println("3");
        } catch (NullPointerException e) {
            System.out.println("4");
        }
    }

    public static void main(String[] args) {
        Cat test = new Cat();
        test.name = "Imad";
        test.parseName();
        System.out.println("5");
    }
}

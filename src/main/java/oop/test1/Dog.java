package oop.test1;

public class Dog {
    public String name;

    public void parseName() {
        System.out.println("1");
        try {
            System.out.println("2");
            int x = Integer.parseInt(name);
            System.out.println("3");
        } catch (NumberFormatException e) {
            System.out.println("4");
        }
    }

    public static void main(String[] args) {
        Dog test = new Dog();
        test.name = "Imad";
        test.parseName();
        System.out.println("5");
    }
}

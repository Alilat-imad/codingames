package oop.test1;

import java.io.IOException;

public class Mouse {
    public String name;

    public void run() {
        System.out.println("1");
        try {
            System.out.println("2");
            name.toString();
            System.out.println("3");
        } catch (NullPointerException ex) {
            System.out.println("4");
            throw ex;
        }
    }

    public Exception test() throws RuntimeException {
        return new Exception();
    }

    public void ohNo1() throws IOException {
    }

    public void ohNo2() throws IOException {
        throw new IOException();
    }

    public void ohNo3() throws IllegalArgumentException {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        Mouse jerry = new Mouse();
        jerry.run();
    }
}

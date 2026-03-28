package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World! My name is Huy";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

    public String getMessage() {
        return MESSAGE;
    }

    public int add(int a, int b) {
        return a + b;
    }
}

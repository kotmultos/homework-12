package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int a = 10;
        int b = 0;


        try {
            double res = Calculator.divide(a, b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.println("Program proceeded to this place");


    }
}

package org.example;

public class Calculator {
    public static double divide(int a, int b) throws Exception {
        int res = 0;
        try {
            res = a / b;
            return res;
        } catch (ArithmeticException e) {
            throw new DivisionByZeroForbiddenException();
        }
        finally {
            System.out.println("finally in calc");
        }

//        return res;
    }
}

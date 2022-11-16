package org.example;

public class DivisionByZeroForbiddenException extends Exception{

    public DivisionByZeroForbiddenException() {
        super("Division by 0 is strictly forbidden.");
    }
}

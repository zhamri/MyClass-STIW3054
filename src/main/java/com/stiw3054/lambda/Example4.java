package com.stiw3054.lambda;

public class Example4 {
    public static void main(String[] args) {

        //with type declaration
        MathOperation addition = (int a, int b) -> a + b;

        //with out type declaration
        MathOperation subtraction = (a, b) -> a - b;

        //with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };

        //without return statement and without curly braces
        MathOperation division = (int a, int b) -> a / b;

        System.out.println(addition.operation(10, 5));
        System.out.println(subtraction.operation(10, 5));
        System.out.println(multiplication.operation(10, 5));
        System.out.println(division.operation(10, 5));
    }

    interface MathOperation {
        int operation(int a, int b);
    }
}


/***
 * 15
 * 5
 * 50
 * 2
 */
package com.stiw3054.lambda;

public class Example1 {
    public static void main(String[] args) {

        Greeting g1 = () -> System.out.println("Hello Java");
        g1.hello();
    }

    interface Greeting {
        void hello();
    }
}


/***
 * Hello Java
 */
package com.stiw3054.lambda;

public class Example2 {
    public static void main(String[] args) {

        Greeting g1 = (n) -> System.out.println("Hello " + n);
        g1.hello("zhamri");
    }

    interface Greeting {
        void hello(String name);
    }
}


/***
 * Hello zhamri
 */
package com.stiw3054.lambda;

public class Example3 {
    public static void main(String[] args) {

        Greeting g1 = (n) -> "Hello " + n;
        System.out.println(g1.hello("zhamri"));
    }

    interface Greeting {
        String hello(String name);
    }
}


/***
 * Hello zhamri
 */
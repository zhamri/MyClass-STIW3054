package com.stiw3054.lambda;

public class Example3 {
    public static void main(String[] args) {

        Greeting g1 = (n) -> "Hello " + n;
        Example3 example3 = new Example3();
        example3.displayHello(g1, "zhamri");
    }

    private void displayHello(Greeting greeting, String name) {
        System.out.println(greeting.hello(name));
    }

    interface Greeting {
        String hello(String name);
    }
}


/***
 * Hello zhamri
 */
package com.stiw3054.lambda;

public class Example4 {
    public static void main(String[] args) {

        Greeting g1 = (n) -> "Hello " + n;
        Example4 example4 = new Example4();
        example4.displayHello(g1, "zhamri");
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
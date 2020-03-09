package com.stiw3054.howtostart;

public class Example8 {

    public static void main(String[] args) {

        new Thread(() -> {
            System.out.println("Hello World");
            System.out.println("Hello World");
            System.out.println("Hello World");
        }).start();
    }
}


/***
 Hello World
 Hello World
 Hello World
 */
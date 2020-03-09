package com.stiw3054.howtostart;

public class Example9 {

    public static void main(String[] args) {

        new Thread(() -> {
            System.out.println("Hello World");
            System.out.println("Hello World");
            System.out.println("Hello World");
        }).start();

        new Thread(() -> {
            System.out.println("Zhamri");
            System.out.println("Zhamri");
            System.out.println("Zhamri");
        }).start();
    }
}


/***
 Hello World
 Hello World
 Hello World
 Zhamri
 Zhamri
 Zhamri
 */
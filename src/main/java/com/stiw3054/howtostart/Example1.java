package com.stiw3054.howtostart;

public class Example1 extends Thread {

    @Override
    public void run() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        Example1 example1 = new Example1();
        example1.start();
    }
}

/***
 * Hello World
 */
package com.stiw3054.howtostart;

public class Example3 implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        new Thread(new Example3()).start();
    }
}

/***
 * Hello World
 */
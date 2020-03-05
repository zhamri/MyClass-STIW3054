package com.stiw3054.howtostart;

public class Example2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        Example2 example2 = new Example2();
        Thread t1 = new Thread(example2);
        t1.start();
    }
}

/***
 * Hello World
 */
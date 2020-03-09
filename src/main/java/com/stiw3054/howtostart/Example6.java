package com.stiw3054.howtostart;

public class Example6 {

    public static void main(String[] args) {
        Runnable r1 = () -> {
            System.out.println("Thread is running...");
        };
        Thread t1 = new Thread(r1);
        t1.start();
    }
}


/***
 * Thread is running...
 */
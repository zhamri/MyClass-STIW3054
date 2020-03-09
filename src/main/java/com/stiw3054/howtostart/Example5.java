package com.stiw3054.howtostart;

public class Example5 {

    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("Thread is running...");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
    }
}


/***
 * Thread is running...
 */

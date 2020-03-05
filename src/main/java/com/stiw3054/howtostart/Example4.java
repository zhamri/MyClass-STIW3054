package com.stiw3054.howtostart;

public class Example4 {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        }).start();
    }
}


/***
 * Hello World
 */

package com.stiw3054.problem.p1;

import java.util.concurrent.TimeUnit;

public class AddTwoNumbers implements Runnable {

    private int a;
    private int b;
    private long sleepTime;
    private int sum;

    public AddTwoNumbers(int a, int b, long sleepTime) {
        this.a = a;
        this.b = b;
        this.sleepTime = sleepTime;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " start running ...");

        try {
            System.out.println(Thread.currentThread().getName() + " sleeping for " + sleepTime + " millis");
            TimeUnit.MILLISECONDS.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        sum = a + b;

        System.out.println(Thread.currentThread().getName() + " done ...");
    }

    public int getSum() {
        return sum;
    }
}

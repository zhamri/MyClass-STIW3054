package com.stiw3054.shutdown;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

class MyTask implements Runnable {

    private int x;

    public MyTask(int x) {
        this.x = x;
    }

    @Override
    public void run() {
        System.out.println(x + ":MyTask:" + Thread.currentThread().getName());
    }
}

public class Shutdown2 {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 10; i++) {
            try {
                executor.submit(new MyTask(i));
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (RejectedExecutionException r) {
                System.out.println("Rejected New Task");
            }
            if (i == 6) {
                executor.shutdown();
            }
        }
        System.out.println("The end ...");
    }
}


/***
 * 1:MyTask:pool-1-thread-1
 * 2:MyTask:pool-1-thread-2
 * 3:MyTask:pool-1-thread-3
 * 4:MyTask:pool-1-thread-1
 * 5:MyTask:pool-1-thread-2
 * 6:MyTask:pool-1-thread-3
 * Rejected New Task
 * Rejected New Task
 * Rejected New Task
 * Rejected New Task
 * The end ...
 */

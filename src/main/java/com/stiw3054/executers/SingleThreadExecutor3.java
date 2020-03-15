package com.stiw3054.executers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor3 {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Executer1 one");
            System.out.println(threadName + " Executer1 two");
            System.out.println(threadName + " Executer1 three");
        });
        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Executer2 one");
            System.out.println(threadName + " Executer2 two");
            System.out.println(threadName + " Executer2 three");
        });
        System.out.println("Before shutdown");
        executor.shutdown();
        System.out.println("After shutdown");
    }
}


/***
 * Before shutdown
 * pool-1-thread-1 Executer1 one
 * pool-1-thread-1 Executer1 two
 * pool-1-thread-1 Executer1 three
 * pool-1-thread-1 Executer2 one
 * pool-1-thread-1 Executer2 two
 * pool-1-thread-1 Executer2 three
 * After shutdown
 */

package com.stiw3054.executers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor2 {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        });
        System.out.println("Before shutdown");
        executor.shutdown();
        System.out.println("After shutdown");
    }
}


/***
 * Before shutdown
 * After shutdown
 * Hello pool-1-thread-1
 */

package com.stiw3054.executers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool1 {

    public static void main(String[] args) {

        System.out.println("Start main");
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "..." + i);
            }
        });
        executor.submit(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "..." + i);
            }
        });
        System.out.println("Before shutdown");
        executor.shutdown();
        System.out.println("After shutdown");
    }
}


/***
 * Start main
 * Before shutdown
 * After shutdown
 * pool-1-thread-1...0
 * pool-1-thread-1...1
 * pool-1-thread-2...0
 * pool-1-thread-1...2
 * pool-1-thread-2...1
 * pool-1-thread-1...3
 * pool-1-thread-2...2
 * pool-1-thread-1...4
 * pool-1-thread-2...3
 * pool-1-thread-1...5
 * pool-1-thread-2...4
 * pool-1-thread-1...6
 * pool-1-thread-2...5
 * pool-1-thread-1...7
 * pool-1-thread-2...6
 * pool-1-thread-1...8
 * pool-1-thread-2...7
 * pool-1-thread-1...9
 * pool-1-thread-2...8
 * pool-1-thread-2...9
 */

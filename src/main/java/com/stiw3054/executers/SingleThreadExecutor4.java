package com.stiw3054.executers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor4 {

    public static void main(String[] args) {

        ExecutorService executor1 = Executors.newSingleThreadExecutor();
        ExecutorService executor2 = Executors.newSingleThreadExecutor();
        executor1.submit(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "..." + i);
            }
        });
        executor2.submit(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "..." + i);
            }
        });
        System.out.println("Before shutdown");
        executor1.shutdown();
        executor2.shutdown();
        System.out.println("After shutdown");
    }
}


/***
 * Before shutdown
 * After shutdown
 * pool-1-thread-1...0
 * pool-2-thread-1...0
 * pool-1-thread-1...1
 * pool-1-thread-1...2
 * pool-1-thread-1...3
 * pool-2-thread-1...1
 * pool-1-thread-1...4
 * pool-2-thread-1...2
 * pool-2-thread-1...3
 * pool-1-thread-1...5
 * pool-2-thread-1...4
 * pool-2-thread-1...5
 * pool-1-thread-1...6
 * pool-2-thread-1...6
 * pool-1-thread-1...7
 * pool-2-thread-1...7
 * pool-1-thread-1...8
 * pool-2-thread-1...8
 * pool-1-thread-1...9
 * pool-2-thread-1...9
 */

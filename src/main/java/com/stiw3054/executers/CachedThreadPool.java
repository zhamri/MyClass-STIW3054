/***
 * Core pool size for cached threadpool is 0.
 * Max pool size = Integer.MAX_VALUE
 */

package com.stiw3054.executers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        ExecutorService ex = Executors.newCachedThreadPool();
        ex.execute(new Task());
        ex.execute(new Task());
        ex.execute(new Task());
        ex.execute(new Task());
        ex.execute(new Task());
        ex.execute(new Task());
        ex.shutdown();
    }
}

class Task implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

/***
 * 2147483647
 * pool-1-thread-1
 * pool-1-thread-4
 * pool-1-thread-3
 * pool-1-thread-5
 * pool-1-thread-6
 * pool-1-thread-2
 */

/***
 * 2147483647
 * pool-1-thread-1
 * pool-1-thread-2
 * pool-1-thread-3
 * pool-1-thread-1
 * pool-1-thread-1
 * pool-1-thread-4
 */

/***
 * 2147483647
 * pool-1-thread-1
 * pool-1-thread-2
 * pool-1-thread-3
 * pool-1-thread-3
 * pool-1-thread-1
 * pool-1-thread-1
 */

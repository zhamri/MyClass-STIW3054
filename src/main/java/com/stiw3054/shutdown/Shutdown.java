package com.stiw3054.shutdown;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Shutdown {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello1 " + threadName);
        });
        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello2 " + threadName);
        });

        System.out.println("Before shutdown");
        executor.shutdown();
        System.out.println("After shutdown");

        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello3 " + threadName);
        });
    }
}


/***
 * Before shutdown
 * After shutdown
 * Exception in thread "main" java.util.concurrent.RejectedExecutionException: Task java.util.concurrent.FutureTask@4c873330[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@eed1f14[Wrapped task = com.stiw3054.shutdown.Shutdown1$$Lambda$18/0x0000000800b4e840@7229724f]] rejected from java.util.concurrent.ThreadPoolExecutor@119d7047[Shutting down, pool size = 2, active threads = 2, queued tasks = 0, completed tasks = 0]
 * 	at java.base/java.util.concurrent.ThreadPoolExecutor$AbortPolicy.rejectedExecution(ThreadPoolExecutor.java:2055)
 * 	at java.base/java.util.concurrent.ThreadPoolExecutor.reject(ThreadPoolExecutor.java:825)
 * 	at java.base/java.util.concurrent.ThreadPoolExecutor.execute(ThreadPoolExecutor.java:1355)
 * 	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:118)
 * 	at com.stiw3054.shutdown.Shutdown1.main(Shutdown1.java:24)
 * Hello1 pool-1-thread-1
 * Hello2 pool-1-thread-2
 */

/***
 * Hello1 pool-1-thread-1
 * Before shutdown
 * After shutdown
 * Hello2 pool-1-thread-2
 * Exception in thread "main" java.util.concurrent.RejectedExecutionException: Task java.util.concurrent.FutureTask@4c873330[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@eed1f14[Wrapped task = com.stiw3054.shutdown.Shutdown1$$Lambda$18/0x0000000800b4ec40@7229724f]] rejected from java.util.concurrent.ThreadPoolExecutor@119d7047[Shutting down, pool size = 1, active threads = 1, queued tasks = 0, completed tasks = 1]
 * 	at java.base/java.util.concurrent.ThreadPoolExecutor$AbortPolicy.rejectedExecution(ThreadPoolExecutor.java:2055)
 * 	at java.base/java.util.concurrent.ThreadPoolExecutor.reject(ThreadPoolExecutor.java:825)
 * 	at java.base/java.util.concurrent.ThreadPoolExecutor.execute(ThreadPoolExecutor.java:1355)
 * 	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:118)
 * 	at com.stiw3054.shutdown.Shutdown1.main(Shutdown1.java:24)
 */

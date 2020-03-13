package com.stiw3054.shutdown;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("Task");
        return null;
    }
}

class LongTask implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("LongTask");
        TimeUnit.SECONDS.sleep(5);
        return null;
    }
}

public class AwaitTermination {

    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService service = Executors.newScheduledThreadPool(4);
        service.submit(new Task());
        service.submit(new Task());
        service.submit(new LongTask());
        service.submit(new Task());

        service.shutdown();

        while (!service.awaitTermination(1, TimeUnit.SECONDS)) {
            System.out.println("awaitTermination");
        }

        System.out.println("The end ...");
    }
}


/***
 * Compare line-20 and line-37, sleep=5 and awaitTermination=1
 * if sleep > awaitTermination
 * -----------------------------------------------------------
 * Task
 * Task
 * LongTask
 * Task
 * awaitTermination
 * awaitTermination
 * awaitTermination
 * awaitTermination
 * The end ...
 */


/***
 *  * Compare line-20 and line-37, sleep=5 and awaitTermination=2
 *  * if sleep > awaitTermination
 * -----------------------------------------------------------
 * Task
 * Task
 * LongTask
 * Task
 * awaitTermination
 * awaitTermination
 * The end ...
 */


/***
 * Compare line-20 and line-37, sleep=5 and awaitTermination=6
 * if sleep < awaitTermination
 * -----------------------------------------------------------
 * Task
 * Task
 * LongTask
 * Task
 * The end ...
 */

package com.stiw3054.callable;

import java.util.concurrent.*;

public class HelloFuture implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("Hello World");
        return "Hello Future";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService ex = Executors.newSingleThreadExecutor();
        HelloFuture helloFuture = new HelloFuture();
        Future<String> f = ex.submit(helloFuture);
        System.out.println(f.get());
        ex.shutdown();
    }
}


/***
 * Hello World
 * Hello Future
 */
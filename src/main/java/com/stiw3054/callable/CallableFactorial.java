package com.stiw3054.callable;

import java.util.concurrent.*;

class CallableFactorialTask implements Callable<Integer> {

    private int num = 0;

    public CallableFactorialTask(int num) {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        int result = 1;
        for (int i = 2; i <= num; i++)
            result *= i;
        return result;
    }
}


public class CallableFactorial {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService service = Executors.newSingleThreadExecutor();
        CallableFactorialTask task = new CallableFactorialTask(5);
        Future<Integer> f = service.submit(task);
        Integer val = f.get();
        System.out.println(val);
        service.shutdown();
    }
}


/***
 * 120
 */
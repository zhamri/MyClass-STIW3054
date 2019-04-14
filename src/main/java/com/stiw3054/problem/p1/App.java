package com.stiw3054.problem.p1;

public class App {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " Main thread starts here...");

        AddTwoNumbers task1 = new AddTwoNumbers(2, 3, 100);
        Thread t1 = new Thread(task1, "Thread-1");

        AddTwoNumbers task2 = new AddTwoNumbers(4, 5, 1000);
        Thread t2 = new Thread(task2, "Thread-2");

        AddTwoNumbers task3 = new AddTwoNumbers(6, 7, 500);
        Thread t3 = new Thread(task3, "Thread-3");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Result-1 = " + task1.getSum());
        System.out.println("Result-2 = " + task2.getSum());
        System.out.println("Result-3 = " + task3.getSum());

        System.out.println(Thread.currentThread().getName() + " Main thread ends here...");
    }
}


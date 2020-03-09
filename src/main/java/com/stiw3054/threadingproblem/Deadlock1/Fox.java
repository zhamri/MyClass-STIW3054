package com.stiw3054.threadingproblem.Deadlock1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Fox {

    public void eatAndDrink(Food food, Water water) {
        synchronized (food) {
            System.out.println("eatAndDrink: Got Food!");
            move();
            synchronized (water) {
                System.out.println("eatAndDrink: Got Water!");
            }
        }
    }

    public void drinkAndEat(Food food, Water water) {
        synchronized (water) {
            System.out.println("drinkAndEat: Got Water!");
            move();
            synchronized (food) {
                System.out.println("drinkAndEat: Got Food!");
            }
        }
    }

    public void move() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // Handle exception
        }
    }

    public static void main(String[] args) {

        Fox fox1 = new Fox();
        Fox fox2 = new Fox();
        Food food = new Food();
        Water water = new Water();

        ExecutorService service = null;
        try {
            service = Executors.newScheduledThreadPool(10);
            service.submit(() -> fox1.eatAndDrink(food, water));
            service.submit(() -> fox2.drinkAndEat(food, water));
        } finally {
            if (service != null) service.shutdown();
        }
    }
}


/***
 * eatAndDrink: Got Food!
 * drinkAndEat: Got Water!
 */

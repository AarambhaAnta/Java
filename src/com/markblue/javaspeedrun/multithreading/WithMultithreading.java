package com.markblue.javaspeedrun.multithreading;

public class WithMultithreading {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        System.out.println("Starting with multithreading...");
        System.out.println("------------------");

        NumberCounter counter = new NumberCounter();
        SumClass sum = new SumClass();
        Thread thread1 = new Thread(sum);

        counter.start();
        thread1.start();

        try {
            counter.join();
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Time elapsed: " + (System.currentTimeMillis() - start));    // Time taken: 709ms
        System.out.println();
    }
}

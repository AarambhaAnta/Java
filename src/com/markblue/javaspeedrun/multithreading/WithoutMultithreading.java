package com.markblue.javaspeedrun.multithreading;

public class WithoutMultithreading {
    public static void main(String[] args) {
        // Without multi-threading
        // calculating time taken to do some task
        long start = System.currentTimeMillis();

        System.out.println("Starting Without Multithreading... ");
        System.out.println("------------------");

        long sum = 0;
        for (int i = 0; i < 1000000000; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);

        long count = 0;
        for (int i = 0; i < 1000000000; i++) {
            if(i % 7 ==0){
                count++;
            }
        }
        System.out.println("count of numbers divisible by 7 = " + count);

        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - start) + "ms");    // Taken time: 1270ms
        System.out.println();
    }
}

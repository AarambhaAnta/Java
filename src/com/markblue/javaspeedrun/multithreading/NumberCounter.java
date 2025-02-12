package com.markblue.javaspeedrun.multithreading;

public class NumberCounter extends Thread {
    @Override
    public void run() {
        long count = 0;
        for (int i = 0; i < 1000000000; i++) {
            if(i % 7 ==0){
                count++;
            }
        }
        System.out.println("count of numbers divisible by 7 = " + count);
    }

}

package com.markblue.javaspeedrun.multithreading;

public class MyThread extends Thread {
    private Counter counter;
    public MyThread(Counter counter) {
        this.counter = counter;
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread myThread1 = new MyThread(counter);
        MyThread myThread2 = new MyThread(counter);

        myThread1.start();
        myThread2.start();

        try {
            myThread1.join();
            myThread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter.getCount());
    }
}
class Counter{
    private int count = 0;
    public synchronized void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }
}

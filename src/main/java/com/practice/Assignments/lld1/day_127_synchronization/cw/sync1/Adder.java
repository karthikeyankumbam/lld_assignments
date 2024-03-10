package com.practice.Assignments.lld1.day_127_synchronization.cw.sync1;

public class Adder implements Runnable {
    private Count count;
    private final Object lock;

    public Adder(Count count, Object lock) {
        this.count = count;
        this.lock =lock;
    }

    @Override
    public void run() {
        for (int i = 1; i < 100000; i++) {
            synchronized (lock){
                count.num++;
            }
//            System.out.println("adder i " + i + " num: " + count.num);
        }
    }
}

package com.practice.Assignments.lld1.day_127_synchronization.cw.sync2;

public class Substractor implements Runnable {
    private Count count;
    private Object lock;

    public Substractor(Count count, Object lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 1; i < 100000; i++) {
          count.decrement();
//            System.out.println("substractor i " + i + " num: " + count.num);
        }
    }
}

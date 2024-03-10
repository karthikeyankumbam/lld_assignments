package com.practice.Assignments.lld1.day_127_synchronization.cw.basic;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    private Count count;
    private Lock lock;

    public Adder(Count count,Lock lock) {
        this.count = count;
        this.lock =lock;
    }

    @Override
    public void run() {
        for (int i = 1; i < 100000; i++) {
            lock.lock();
            count.num++;
            lock.unlock();
            System.out.println("adder i " + i + " num: " + count.num);
        }
    }
}

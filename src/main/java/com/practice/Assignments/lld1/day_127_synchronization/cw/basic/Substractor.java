package com.practice.Assignments.lld1.day_127_synchronization.cw.basic;

import com.practice.Assignments.lld1.day_127_synchronization.cw.basic.Count;

import java.util.concurrent.locks.Lock;

public class Substractor implements Runnable {
    private Count count;
    private Lock lock;

    public Substractor(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 1; i < 100000; i++) {
            lock.lock();
            count.num--;
            lock.unlock();
            System.out.println("substractor i " + i + " num: " + count.num);
        }
    }
}

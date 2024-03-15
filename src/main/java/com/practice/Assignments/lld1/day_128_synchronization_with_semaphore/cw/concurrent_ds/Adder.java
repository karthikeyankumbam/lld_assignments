package com.practice.Assignments.lld1.day_128_synchronization_with_semaphore.cw.concurrent_ds;

import com.practice.Assignments.lld1.day_127_synchronization.cw.basic.Count;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    private AtomicInteger ai;


    public Adder(AtomicInteger ai) {
this.ai=ai;
    }

    @Override
    public void run() {
        for (int i = 1; i < 100000; i++) {
            ai.getAndIncrement();
            System.out.println("adder i " + i + " num: " );
        }
    }
}

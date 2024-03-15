package com.practice.Assignments.lld1.day_128_synchronization_with_semaphore.cw.concurrent_ds_scenario_1;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Substractor implements Runnable {
    private AtomicInteger ai;
    private AtomicBoolean ab;


    public Substractor(AtomicInteger ai,AtomicBoolean ab) {
        this.ab=ab;
        this.ai=ai;
    }

    @Override
    public void run() {
        for (int i = 1; i < 100000; i++) {
            ai.getAndIncrement();
            ab.set(false);
            System.out.println("adder i " + i + " num: " );
        }
    }
}

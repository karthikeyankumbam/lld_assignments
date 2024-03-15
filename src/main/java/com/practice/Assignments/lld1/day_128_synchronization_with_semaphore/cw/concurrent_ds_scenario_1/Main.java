package com.practice.Assignments.lld1.day_128_synchronization_with_semaphore.cw.concurrent_ds_scenario_1;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger ai=new AtomicInteger(0);
        AtomicBoolean ab=new AtomicBoolean(false);
        Substractor substractor=new Substractor(ai,ab);
        Adder adder=new Adder(ai,ab);
        Thread thread1=new Thread(adder);
        Thread thread2=new Thread(substractor);
        thread1.start();
        thread2.start();


        thread1.join();
        thread2.join();
        System.out.println(" atomic Integer: "+ai.get());
        System.out.println(" boolean: "+ab.get());

    }
}

package com.practice.Assignments.lld1.day_128_synchronization_with_semaphore.cw.concurrent_ds;

import com.practice.Assignments.lld1.day_127_synchronization.cw.basic.Count;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger ai=new AtomicInteger(0);
        Substractor substractor=new Substractor(ai);
        Adder adder=new Adder(ai);
        Thread thread1=new Thread(adder);
        Thread thread2=new Thread(substractor);
        thread1.start();
        thread2.start();


        thread1.join();
        thread2.join();
        System.out.println(" num: "+ai.get());
    }
}

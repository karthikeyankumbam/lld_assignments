package com.practice.Assignments.lld1.day_128_synchronization_with_semaphore.cw.semapore;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Queue<String> items=new LinkedList<>();
        Semaphore counsumerSemaphore=new Semaphore(4);
        Semaphore producerSemaphore=new Semaphore(4);
        Consumer consumer=new Consumer(items,counsumerSemaphore,producerSemaphore);
        Producer producer=new Producer(items,counsumerSemaphore,producerSemaphore);
        Thread t1=new Thread(producer);
        Thread t2=new Thread(consumer);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(items);

    }
}

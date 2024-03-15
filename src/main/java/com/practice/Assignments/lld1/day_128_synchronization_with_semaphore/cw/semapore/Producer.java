package com.practice.Assignments.lld1.day_128_synchronization_with_semaphore.cw.semapore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Queue<String> items;
    private Semaphore consumerSemaphore;
    private Semaphore producerSemaphore;

    public Producer(Queue<String> items, Semaphore consumerSemaphore, Semaphore producerSemaphore) {
        this.items = items;
        this.consumerSemaphore = consumerSemaphore;
        this.producerSemaphore = producerSemaphore;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                producerSemaphore.acquire();
//                System.out.println("producer");
                items.add("Item " + i);
//                System.out.println(items.size());

                consumerSemaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

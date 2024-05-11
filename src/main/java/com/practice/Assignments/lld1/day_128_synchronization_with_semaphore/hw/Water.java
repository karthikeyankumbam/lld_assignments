package com.practice.Assignments.lld1.day_128_synchronization_with_semaphore.hw;

import java.util.concurrent.Semaphore;

public class Water {
    private static class H2O {
        Semaphore hydrogenSemaphore;
        Semaphore oxygenSemaphore;
        public H2O() {
            hydrogenSemaphore=new Semaphore(2);
            oxygenSemaphore=new Semaphore(0);
        }

        public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
            hydrogenSemaphore.acquire();
            // releaseHydrogen.run() outputs "H". Do not change or remove this line.
            releaseHydrogen.run();
            if(hydrogenSemaphore.availablePermits()==0) {
                oxygenSemaphore.release();
            }
        }

        public void oxygen(Runnable releaseOxygen) throws InterruptedException {
            oxygenSemaphore.acquire();
            // releaseOxygen.run() outputs "O". Do not change or remove this line.
            releaseOxygen.run();
            hydrogenSemaphore.release(2);
        }
    }
}
